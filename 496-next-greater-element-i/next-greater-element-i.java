class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int []nextgreater=new int[n2];
        Arrays.fill(nextgreater,-1);
        // used monotonic stack
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n2;i++){
            while(!stack.empty() && nums2[i]>nums2[stack.peek()]){
                int index=stack.pop();//pop the top most element
                nextgreater[index]=nums2[i];
            }
            stack.push(i);
        }
        int result[]=new int[n1];
        // int idx=0;
        for(int i=0;i<n1;i++){
            int idx=0;
            while(idx<n2 && nums2[idx]!=nums1[i]){
                idx++;
            }
            result[i]=nextgreater[idx];
        }
        return result;
    }

}