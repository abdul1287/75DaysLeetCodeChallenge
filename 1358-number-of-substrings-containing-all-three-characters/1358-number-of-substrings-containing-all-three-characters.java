class Solution {
    public int numberOfSubstrings(String s) {
        // Brute Force -> O(n3)
        // int count = 0;
        // for(int i=0; i<s.length(); i++) {
        //     for(int j=i; j<s.length(); j++) {
        //         boolean a = false;
        //         boolean b = false;
        //         boolean c = false;
        //         for(int k=i; k<=j; k++) {
        //             if(s.charAt(k) == 'a') a = true;
        //             if(s.charAt(k) == 'b') b = true;
        //             if(s.charAt(k) == 'c') c = true;
        //         }

        //         if(a && b && c) {
        //             count++;
        //         }
        //     }
        // }

        // return count;

        // Better Solution -> O(n)
        // int l = 0, count = 0;
        // int[] freq = new int[3];
        // for(int r=0; r<s.length(); r++) {
        //     freq[s.charAt(r) - 'a']++;

        //     while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
        //         count += s.length() - r;
        //         freq[s.charAt(l) - 'a']--;
        //         l++;
        //     }
        // }

        // return count;

        // Optimal Solution -> O(n) -> (inner loop removed)

        int[] last = { -1, -1, -1 }; // last index of a, b, c
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;

            int minIndex = Math.min(last[0], Math.min(last[1], last[2]));

            if (minIndex != -1) {
                count += minIndex + 1;
            }
        }
        return count;
    }
}