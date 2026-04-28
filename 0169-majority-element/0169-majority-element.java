class Solution {
    public int majorityElement(int[] nums) {

        // Better Solution -> T.C -> O(n) & S.C -> O(n)
        // HashMap<Integer, Integer> hm = new HashMap<>();

        // int n = nums.length;
        // for(int num : nums) {
        //     hm.put(num, hm.getOrDefault(num, 0) + 1);
        // }

        // for(int num : nums) {
        //     if(hm.get(num) > n/2) {
        //         return num;
        //     }
        // }

        // return -1;

        // Optimal Solution -> T.C -> O(n) -> Moore's Voting Algorithm
        int candidate = -1;
        int count = 0;

        int i = 0;
        while (i < nums.length) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
            i++;
        }

        count = 0;
        for (int j = 0; j < nums.length; j++) {
            if (candidate == nums[j]) {
                count++;
            }
            if (count > nums.length / 2) {
                return candidate;
            }
        }

        return -1;
    }
}