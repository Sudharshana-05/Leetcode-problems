class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int candi1=0;
        int candi2=0;
        int cnt1=0;
        int cnt2=0;
        for(int i:nums){
            if(candi1==i){
                
                cnt1++;
            }
            else if (candi2==i){
             
                cnt2++;
            }
            else if(cnt1==0){
                candi1=i;
                cnt1=1;
            }
            else if(cnt2==0){
                candi2=i;
                cnt2=1;
            }
            else{
                cnt1--;
                cnt2--;

            }

        }
        int ct1=0;
        int ct2=0;
        for(int i:nums){
            if (i==candi1){
                ct1++;
            }
            else if(i==candi2){
                ct2++;
            }
        }
        List<Integer>ans=new ArrayList<>();
        if(ct1>n/3){
            ans.add(candi1);
        }
        if (candi1 !=candi2 && ct2>n/3){
            ans.add(candi2);
        }
        return ans;

    }
}