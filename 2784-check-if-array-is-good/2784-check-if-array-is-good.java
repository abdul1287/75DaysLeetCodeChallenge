class Solution {
    public boolean isGood(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums[nums.length-1];
        // if(nums.length != n + 1) return false;

        // for(int i=0; i<nums.length-1; i++) {
        //     if(nums[i] != i+1) {
        //         return false;
        //     }
        // }

        // return (n == nums[nums.length-1]);

        int n = nums[0];
        for (int j = 0; j < nums.length; j++) {
            n = Math.max(n, nums[j]);
        }
        if (nums.length != n + 1)
            return false;

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] != j + 1) {
                return false;
            }
        }

        return (n == nums[nums.length - 1]);
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}