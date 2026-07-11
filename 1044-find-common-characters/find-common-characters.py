class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        minfreq=[float('inf')]*26
        for word in words:
            freq=[0]*26

            for ch in word:
                freq[ord(ch) - ord('a')] += 1
            for i in range(26):
                minfreq[i]=min(minfreq[i],freq[i])
        
        ans=[]

        for i in range(26):
            while minfreq[i]>0:
                ans.append(chr(i+ord('a')))
                minfreq[i]-=1
        return ans