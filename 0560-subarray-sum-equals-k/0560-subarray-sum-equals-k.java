class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int total = 0, count = 0;

        for (int no : nums) {
            total += no;
            if (hm.containsKey(total - k)) {
                count += hm.get(total - k);
            }
            hm.put(total, hm.getOrDefault(total, 0) + 1);
        }

        return count;
    }
}