class Solution {
    public int splitArray(int[] nums, int k) {
        
        int st = 0;
        int end = 0;

        for(int i=0; i<nums.length; i++) {
            st = Math.max(st, nums[i]);  // contains max element
            end += nums[i];              // contains sum
        }
        
        // Binary Search
        while(st < end) {
            int mid = st + (end-st) / 2;
            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if(sum + num > mid) {
                // you cannot add this in sub-array, make new one
				// say you add this num in new sub-array, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;  // keep adding elements(sub-array)
                }
            }

            if(pieces > k) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }

        return st;  // st == end so, no matter what is returned as ans
    }
}