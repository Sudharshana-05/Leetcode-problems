class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int arr:nums){
            mp.put(arr,mp.getOrDefault(arr,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }
        }
        return -1;

    }
}