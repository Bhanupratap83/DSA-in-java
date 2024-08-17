public class sum {
    public static int isMagicSquare(int grid[][]){
        int count =0;
        for(int i=0; i<=grid.length-3; i++){
            for(int j=0; j<=grid[0].length-3; j++){
                if(gridWays(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean gridWays(int grid[][], int x, int y){
        boolean digits[] = new boolean[10];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int num = grid[x+i][y+j];
                if(num < 1 || num > 9 || digits[num]){
                    return false;
                }
                digits[num] = true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int grid[][] = {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};
        System.out.println(isMagicSquare(grid));
    }
}
