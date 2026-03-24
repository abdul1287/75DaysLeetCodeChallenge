class Solution {
    public int maxArea(int[] height) {

       // Brute Force Approach -> O(n2)
        // int water = 0;
        // for(int i=0; i<height.length; i++) {
        //     for(int j=i+1; j<height.length; j++) {
        //     water = Math.max(water, (j-i) * Math.min(height[i], height[j]));
        //     }
        // }
        // return water;

        // Optimal Approach -> O(n)

        int left=0;
        int right=height.length-1;
        int water = 0;
        while(left < right) {
            water = Math.max(water, (right-left) * Math.min(height[left], height[right]));
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return water;
    }
}