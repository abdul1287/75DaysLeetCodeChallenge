class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Better Solution
        // HashSet<Character> hs = new HashSet<>();
        // int left = 0;
        // int maxLen = 0;
        // for(int right=0; right < s.length(); right++) {
        //     while(hs.contains(s.charAt(right))) {
        //         hs.remove(s.charAt(left));
        //         left++;
        //     }
        //     hs.add(s.charAt(right));
        //     maxLen = Math.max(maxLen, right - left + 1);
        // }

        // return maxLen;

        // Optimal Solution 
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> hm = new HashMap<>();

        for(int right=0; right<s.length(); right++) {
            char ch = s.charAt(right);
            if(hm.containsKey(ch) && hm.get(ch) >= left) {
                left = hm.get(ch) + 1;
            }
            maxLength = Math.max(maxLength, right-left + 1);
            hm.put(ch, right);
        }

        return maxLength;
    }
}