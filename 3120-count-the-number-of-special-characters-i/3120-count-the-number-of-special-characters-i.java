class Solution {
    public int numberOfSpecialChars(String word) {
        int[] freq = new int[256];
        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i)]++;
        }
        int count = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (freq[ch] > 0 && freq[Character.toUpperCase(ch)] > 0) {
                count++;
            }
        }
        return count;
    }
}