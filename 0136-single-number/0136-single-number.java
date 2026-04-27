class Solution {
    public int singleNumber(int[] nums) {
        
        int num = 0;
        for(int no : nums) {
            num ^= no;
        }

        return num;
    }
}