class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        // Brute Force -> T.C -> O(n * n * r)
        // for(int i=1; i<=numRows; i++) {
        //     List<Integer> temp = new ArrayList<>();
        //     for(int j=1; j<=i; j++) {
        //         temp.add(cal(i-1, j-1));
        //     }
        //     list.add(temp);
        // }

        // return list;

        // Optimal Solution -> T.C -> O(n * n)
        for(int i=1; i<=numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            int ans = 1;
            temp.add(ans);
            for(int j=1; j<i; j++) {
            ans = ans * (i - j);
            ans = ans / j;
            temp.add(ans);
          }
          list.add(temp);
        }

        return list;
    }

    int cal(int n, int r) {
        int res = 1;
        for(int i=0; i<r; i++) {
            res = res * (n - i);
            res = res / (i+1);
        }

        return res;
    }
}