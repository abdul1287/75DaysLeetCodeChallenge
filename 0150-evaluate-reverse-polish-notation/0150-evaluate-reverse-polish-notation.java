class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<tokens.length; i++) {
            String token = tokens[i];
            if(isOperator(token)) {
               int b = st.pop();
               int a = st.pop();
               int res = 0;
               switch(token) {
                case "+" : res = a + b; break;
                case "-" : res = a - b; break;
                case "*" : res = a * b; break;
                case "/" : res = a / b; break;
               }
               st.push(res);
            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }

    boolean isOperator(String s) {
return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}