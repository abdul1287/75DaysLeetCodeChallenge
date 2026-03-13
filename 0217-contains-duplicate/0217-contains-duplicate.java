class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Solution 1 -> T.C -> O(nlogn) & S.C -> O(1)
        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++) {
        //     if(nums[i] == nums[i-1]) {
        //         return true;
        //     }
        // }
        // return false;

        // Solution 2 -> T.C -> O(n) & S.C -> O(n)
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            if (hs.contains(num)) {
                return true;
            } else {
                hs.add(num);
            }
        }
        return false;
    }
}