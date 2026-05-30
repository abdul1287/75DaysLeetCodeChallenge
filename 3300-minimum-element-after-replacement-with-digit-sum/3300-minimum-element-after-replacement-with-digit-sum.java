class Solution {
    public int minElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // nums[i] = sum(String.valueOf(nums[i]));
            nums[i] = sum(nums[i]);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }

    // int sum(String str) {
    //     int sum = 0;
    //     for (int i = 0; i < str.length(); i++) {
    //         sum += Integer.parseInt(String.valueOf(str.charAt(i)));
    //     }
    //     return sum;
    // }

    int sum(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
}