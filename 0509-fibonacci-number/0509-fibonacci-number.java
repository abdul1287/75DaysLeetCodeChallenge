class Solution {
    public int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int first = 0;
        int second = 1;
        int i = 2;
        int sum = 0;
        while (i <= n) {
            sum = first + second;
            first = second;
            second = sum;
            i++;
        }

        return sum;
    }
}