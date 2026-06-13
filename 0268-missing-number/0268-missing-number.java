class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;

        // Cyclic sort solution
        // int i = 0;
        // while (i < arr.length) {
        //     int correct = arr[i];
        //     if (arr[i] < arr.length && arr[i] != arr[correct]) {
        //         swap(arr, i, correct);
        //     } else {
        //         i++;
        //     }
        // }

        // for (int index = 0; index < arr.length; index++) {
        //     if (arr[index] != index) {
        //         return index;
        //     }
        // }

        // return arr.length;
    }

    // void swap(int[] arr, int a, int b) {
    //     int temp = arr[a];
    //     arr[a] = arr[b];
    //     arr[b] = temp;
    // }
}