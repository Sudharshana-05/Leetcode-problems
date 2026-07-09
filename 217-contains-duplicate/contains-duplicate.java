class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int arr:nums){
            mp.put(arr,mp.getOrDefault(arr,0)+1);
        }
        for(int arr:nums){
            if(mp.get(arr)>1){
                return true;
            }
        }
        return false;
    }
}