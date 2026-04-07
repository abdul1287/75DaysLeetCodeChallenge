class Solution {
    public int search(int[] arr, int target) {

        // Kunal Kushwaha approach
        // int pivot = pivot(arr);

        // if(pivot == -1) {
        //     return binarySearch(arr, 0, arr.length-1, target);
        // }

        // if(arr[pivot] == target) {
        //     return pivot;
        // }

        // if(target >= arr[0]) {
        //     return binarySearch(arr, 0, pivot-1, target);
        // }

        // return binarySearch(arr, pivot+1, arr.length-1, target);

        // Strivers Approach
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Left half sorted
            if (arr[st] <= arr[mid]) {
                if (arr[st] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                // Right half sorted
                if (target <= arr[end] && target >= arr[mid]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    // int pivot(int[] arr) {

    //     int st = 0;
    //     int end = arr.length-1;

    //     while(st <= end) {
    //         int mid = st + (end-st) / 2;

    //         if(mid < end && arr[mid] > arr[mid+1]) {
    //             return mid;
    //         }
    //         if(mid > st && arr[mid] < arr[mid-1]) {
    //             return mid-1;
    //         }

    //         if(arr[mid] <= arr[st]) {
    //             end = mid-1;
    //         } else {
    //             st = mid+1;
    //         }
    //     }

    //     return -1;
    // }

    // int binarySearch(int[] arr, int st, int end, int key) {

    //     while(st <= end) {
    //         int mid = st + (end-st) / 2;

    //         if(arr[mid] < key) {
    //             st = mid+1;
    //         } else if(arr[mid] > key) {
    //             end = mid-1;
    //         } else {
    //             return mid;
    //         }
    //     }

    //     return -1;
    // }
}