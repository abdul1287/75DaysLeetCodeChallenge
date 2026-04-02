class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Brute Force Approach -> O(n2) & S.C -> O(n)
        // int[] temp = new int[temperatures.length];

        // for(int i = 0; i < temperatures.length; i++) {
        //     int dayTemp = temperatures[i];
        //     int count = 0;
        //     boolean found = false;
        //     for(int j = i + 1; j < temperatures.length; j++) {
        //         count++;
        //         if(temperatures[j] > dayTemp) {
        //             found = true;
        //             break;
        //         }
        //     }

        //     temp[i] = found ? count : 0;
        // }

        // return temp;

        // Optimal Solution -> T.C -> O(n) & S.C -> O(n)
        int[] res = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
                int prevIdx = st.pop();
                res[prevIdx] = i - prevIdx;
            }
            st.push(i);
        }

        return res;
    }
}