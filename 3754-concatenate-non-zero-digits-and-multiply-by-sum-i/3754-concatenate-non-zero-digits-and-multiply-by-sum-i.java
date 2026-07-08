class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0)
            return 0;
        // Solution 1 -> T.C -> O(logn) and S.C -> O(logn)
        // String num = String.valueOf(n);
        // String str = num.replace("0", "");
        // int x = Integer.parseInt(str);

        // long sum = 0;
        // int tempx = x;
        // while (tempx > 0) {
        //     int rem = tempx % 10;
        //     sum += (long) rem;
        //     tempx /= 10;
        // }

        // return (long) sum * x;

        // Solution 2 -> T.C -> O(logn) and S.C -> O(1)
        int rev = reverse(n);
        int num = reverse(rev);
        int x = num;
        long sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }

        return (long) sum * x;
    }

    int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) {
                num /= 10;
                continue;
            }
            rev = (rev * 10) + rem;
            num /= 10;
        }
        return rev;
    }
}