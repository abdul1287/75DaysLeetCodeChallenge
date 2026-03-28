class Solution {
    public int characterReplacement(String s, int k) {
        
        // Brute Force -> O(n2)
        // int maxLen = 0;
        // for(int i=0; i<s.length(); i++) {
        //     int[] hash = new int[26];
        //     int maxFreq = 0;
        //     for(int j=i; j<s.length(); j++) {
        //        hash[s.charAt(j) - 'A']++;
        //        maxFreq = Math.max(maxFreq, hash[s.charAt(j) - 'A']);
        //        int changes = (j - i + 1) - maxFreq;
        //        if(changes <= k) {
        //         maxLen = Math.max(maxLen, j - i + 1);
        //        } else {
        //         break;
        //        }
        //     
        // }

        // return maxLen;

        // Optimal Solution -> O(n)
        int l = 0, maxLen = 0, maxFreq = 0;
        int[] hash = new int[26];
        for(int r=0; r<s.length(); r++) {
            hash[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(r) - 'A']);
            if((r - l + 1) - maxFreq > k) {
                hash[s.charAt(l) - 'A']--;
                l++;
            }
            if((r - l + 1) - maxFreq <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }

        return maxLen;
    }
}