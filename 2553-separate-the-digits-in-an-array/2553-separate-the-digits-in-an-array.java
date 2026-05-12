class Solution {
    public int[] separateDigits(int[] nums) {
        String str = "";
        for (int i = 0; i < nums.length; i++) {
            str += nums[i];
        }
        int[] res = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            res[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return res;
    }
}