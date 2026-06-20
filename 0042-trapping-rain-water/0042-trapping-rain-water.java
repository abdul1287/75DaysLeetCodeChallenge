class Solution {
    public int trap(int[] height) {
        // Prefix and Suffix -> T.C -> O(n) & S.C -> O(n)
        // int n = height.length;
        // int[] left = new int[n];
        // int[] right = new int[n];

        // left[0] = height[0];
        // right[n-1] = height[n-1];

        // for(int i=1; i<n; i++) {
        //     left[i] = Math.max(left[i-1], height[i]);
        // }

        // for(int i=n-2; i>=0; i--) {
        //     right[i] = Math.max(right[i+1], height[i]);
        // }

        // int ans = 0;

        // for(int i=0; i<height.length; i++) {
        //     ans += (Math.min(left[i], right[i]) - height[i]);
        // }

        // return ans;

        // Two Pointer -> T.C -> O(n) (Optimal)
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rightMax = height[right];
        int total = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                total += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                total += rightMax - height[right];
            }
        }

        return total;
    }
}