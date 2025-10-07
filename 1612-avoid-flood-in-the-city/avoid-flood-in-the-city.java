class Solution {
    public int[] avoidFlood(int[] rains) {
        int n= rains.length;
        int[] ans= new int[n];
        // fill the array with 1, we dont need to change the value of unused dry days later
        for(int i=0;i<n;i++){
            ans[i]=1;
        }
        // map to add the last rain with index
        HashMap<Integer, Integer> map = new HashMap<>();
        // list to add the dry days
        List<Integer> list= new ArrayList<>();

        for(int i=0; i<n; i++){
            if(rains[i]>0){
                ans[i]=-1;
                int temp= rains[i];
                boolean flood= true;
                
                if(map.containsKey(temp)){
                    int lastRain= map.get(temp);
                    for(int d=0;d<list.size(); d++){
// Check if there is the dry day after the last rain , when the rain appears again for the no                
                        if(list.get(d)> lastRain){
                            flood=false;
                            ans[list.get(d)]= temp;
                            list.remove(list.get(d));
                            break;
                        }
                    }
                    if(flood) return new int[] {};
                }
 // Update the last date for the rain               
                 map.put(temp, i);
            }
// Update the dry day list             
            else list.add(i);
        }
        return ans;
    }
}