class Solution {
    public int longestConsecutive(int[] nums) {

        // Brute Force -> T.C -> O(n3)
        //    int longestLen = 0;
        //    for(int i=0; i<nums.length; i++) {
        //        int count = 1;
        //        int x = nums[i];
        //        while(isExist(nums, x+1)) {
        //           x++;
        //           count++;
        //        }
        //        longestLen = Math.max(longestLen, count);
        //    }

        //    return longestLen;

        // Better Solution -> T.C -> O(nlogn)
        //    Arrays.sort(nums);
        //    int currCount = 0;
        //    int longest = 0;
        //    int last_smaller = Integer.MIN_VALUE;

        //    for(int i=0; i<nums.length; i++) {
        //       if(nums[i] - 1 == last_smaller) {
        //         currCount++;
        //         last_smaller = nums[i];
        //       } else if(nums[i] != last_smaller) {
        //         currCount = 1;
        //         last_smaller = nums[i];
        //       }
        //       longest = Math.max(longest, currCount);
        //    }

        //    return longest;

        // Optimal Solution -> T.C -> O(n) & S.C -> O(n)
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        int ans = 0;
        for (int num : hs) {
            if (!hs.contains(num - 1)) {
                int curr = num;
                int count = 1;
                while (hs.contains(curr + 1)) {
                    curr++;
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    boolean isExist(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
}