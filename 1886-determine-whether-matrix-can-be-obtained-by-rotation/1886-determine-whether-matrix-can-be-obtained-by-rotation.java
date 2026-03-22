class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        boolean found = false;
        for(int i=0; i<4; i++) {
            if(!Arrays.deepEquals(mat, target)) {
                reverse(mat);
                transpose(mat);
            } else {
                found = true;
                break;
            }
        }
        return found;
    }

    void transpose(int[][] mat) {

        for(int i=0; i<mat.length; i++) {
            for(int j=i+1; j<mat[i].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    void reverse(int[][] mat) {

        for(int i=0; i<mat.length; i++) {
            int left = 0;
            int right = mat[i].length-1;

            while(left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}