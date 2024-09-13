public class RotateImage{
    
        public void rotate(int[][] matrix) {
            int n = matrix.length;
    
            // transpose without using more space
            for(int i=0; i<n; i++){
                for(int j=i; j<n; j++){
                    int temp = matrix[i][j];        // 1  4  7
                    matrix[i][j] = matrix[j][i];    // 2  5  8
                    matrix[j][i] = temp;            // 3  6  9
                }
            }
    
            for(int i=0; i<n; i++){
                int left = 0;
                int right = n-1;
                while(left < right){
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];  // 7  4  1
                    matrix[i][right] = temp;             // 8  5  2
                    left++;                              // 9  6  3
                    right--;
                }
            }
        }
    
}