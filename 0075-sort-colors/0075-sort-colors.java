class Solution {
    public void sortColors(int[] arr) {

        //  Better Solution
        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;

        // for(int i=0; i<arr.length; i++) {
        //     if(arr[i] == 0) {
        //         count0++;
        //     } else if(arr[i] == 1) {
        //         count1++;
        //     } else {
        //         count2++;
        //     }
        // }

        // for(int i=0; i<count0; i++) {
        //     arr[i] = 0;
        // }
        // for(int i=count0; i<count0 + count1; i++) {
        //     arr[i] = 1;
        // }
        // for(int i=count0 + count1; i<arr.length; i++) {
        //     arr[i] = 2;
        // }

        // Optimal Soution -> (Dutch National Flag Algorithm) -> O(n)
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}