class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(String op:operations){
            switch(op){
                case "C":
                st.pop();
                break;
                case "D":
                 st.push(st.peek()*2);
                 break;
                 case "+":
                int n=st.pop();
                int top=n+st.peek();
                 st.push(n);
                 st.push(top);
                 break;
                  default:
                  st.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int ans:st ){
            sum+=ans;
        }
        return sum;

    }
}