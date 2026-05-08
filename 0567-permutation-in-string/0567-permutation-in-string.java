class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i), 0) + 1);
            hm2.put(s2.charAt(i), hm2.getOrDefault(s2.charAt(i), 0) + 1);
        }
        if (hm1.equals(hm2))
            return true;

        int left = 0;
        for (int right = s1.length(); right < s2.length(); right++) {
            char ch = s2.charAt(right);
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1);
            char c = s2.charAt(left);
            hm2.put(c, hm2.get(c) - 1);
            if (hm2.get(c) == 0)
                hm2.remove(c);
            left++;
            if (hm1.equals(hm2))
                return true;
        }

        return false;
    }
}