class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int nums:arr){
            mp.put(nums,mp.getOrDefault(nums,0)+1);
        }
        HashSet<Integer>set=new HashSet<>();

        for(int i:mp.values()){
            if(set.contains(i)){
                return false;
            }
            set.add(i);
        }
        return true;
    }
}