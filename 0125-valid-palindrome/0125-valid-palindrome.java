class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(str);

        if(sb.reverse().toString().equals(str)) {
            return true;
        }

        return false;
    }
}