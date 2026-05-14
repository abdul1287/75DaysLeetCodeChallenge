class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;
        int st = 1;
        int end = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            end = Math.max(end, piles[i]);
        }

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (totalTime(piles, mid) <= h) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return st;
    }

    int totalTime(int[] arr, int hourly) {
        int totalHour = 0;
        for (int i = 0; i < arr.length; i++) {
            totalHour += Math.ceil((double) arr[i] / (double) hourly);
        }

        return totalHour;
    }
}