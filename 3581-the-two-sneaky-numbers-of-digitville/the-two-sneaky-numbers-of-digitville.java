class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        // hashmap will store uniquely traversed item
        // and if a item not found in hashmap 
        /// return those 2 elements
        // then we will get the ans
        HashMap<Integer,Integer> ans = new HashMap<>();
        int [] res1 = new int[2];
        int k = 0;
        int n = nums.length;
        for(int num:nums){
            if(ans.containsKey(num)){
                res1[k++] = num;
            }
            else{
                ans.put(num,1);
            }
        }
        return res1;
    }
}