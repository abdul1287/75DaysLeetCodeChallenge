class Solution {
    public int totalFruit(int[] fruits) {

        // Brute Force -> T.C -> O(N^2)
        // int maxLen = Integer.MIN_VALUE;
        // for(int i=0; i<fruits.length; i++) {
        //     Set<Integer> hs = new HashSet<>();
        //     for(int j=i; j<fruits.length; j++) {
        //         hs.add(fruits[j]);
        //         if(hs.size() <= 2) {
        //             maxLen = Math.max(maxLen, j - i + 1);
        //         } else {
        //             break;
        //         }
        //     }
        // }

        // return maxLen;

        // Better Solution -> T.C -> O(N)
        // int l=0, maxLen=0;
        // HashMap<Integer, Integer> hm = new HashMap<>();

        // for(int r=0; r<fruits.length; r++) {
        //     hm.put(fruits[r], hm.getOrDefault(fruits[r], 0) + 1);
        //     if(hm.size() > 2) {
        //        while(hm.size() > 2) {
        //         hm.put(fruits[l], hm.get(fruits[l]) - 1);
        //         if(hm.get(fruits[l]) == 0) {
        //             hm.remove(fruits[l]);
        //         }
        //         l++;
        //        }
        //     } else {
        //         maxLen = Math.max(maxLen, r - l + 1); 
        //     }
        // }

        // return maxLen;

        // Optimal Solution -> T.C -> O(N)
        int l = 0, maxLen = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int r = 0; r < fruits.length; r++) {
            hm.put(fruits[r], hm.getOrDefault(fruits[r], 0) + 1);
            if (hm.size() > 2) {
                hm.put(fruits[l], hm.get(fruits[l]) - 1);
                if (hm.get(fruits[l]) == 0) {
                    hm.remove(fruits[l]);
                }
                l++;
                if (hm.size() <= 2) {
                    maxLen = Math.max(maxLen, r - l + 1);
                }
            } else {
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }

        return maxLen;

    }
}