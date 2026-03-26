class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = 0.0;
        int sum = 0;
        for(int i=0; i<k; i++) {
           sum += nums[i];
        }
        maxAvg = (double)sum / k;
        int left = 0;
        for(int right=k; right<nums.length; right++) {
            sum -= nums[left];
            sum += nums[right];
            maxAvg = Math.max(maxAvg, (double)sum / k);
            left++;
        }

        return maxAvg;
    }
}