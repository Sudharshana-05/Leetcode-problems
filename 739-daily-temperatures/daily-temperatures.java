class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int []result=new int[n];
        Arrays.fill(result,0);
        Stack<Integer>st=new Stack<>();
        
        for(int i=0;i<n;i++){
            // int cnt=0;
            while(!st.empty() && temperatures[i]>temperatures[st.peek()]){
            //    cnt++;
                int index=st.pop();
                // cnt++;
                result[index]=i-index;
            }
            st.push(i);
        }
        return result;
    }
}