public class DiagonalTraverse{
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int res[] = new int[n*m];
        int col = 0, row = 0;

        for(int i=0; i<n*m; i++){
            res[i] = mat[row][col];

            if((row+col) % 2 == 0){
                if(col == m-1) row++;
                else if(row == 0) col++;
                else {
                    row--;
                    col++;
                }
            } else {
                if(row == n-1) col++;
                else if(col == 0) row++;
                else{
                    row++;
                    col--;
                }
            }
        }
        return res;
    }
}