class Solution {
    public int findMin(int[] arr) {

        int st = 0;
        int end = arr.length - 1;
        int min = Integer.MAX_VALUE;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[st] <= arr[end]) {
                min = Math.min(min, arr[st]);
                break;
            }

            // left half sorted
            if (arr[st] <= arr[mid]) {
                min = Math.min(min, arr[st]);
                st = mid + 1;
            } else {
                // right half sorted
                min = Math.min(min, arr[mid]);
                end = mid - 1;
            }
        }

        return min;
    }
}