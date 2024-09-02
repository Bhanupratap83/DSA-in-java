public class OneDToTwoD {
    
        public static int[][] construct2DArray(int[] original, int m, int n) {
            // jab 1d array 2d me change ho hi nahi skta 

            if(m*n != original.length){
                return new int[0][0];
            }
    
            // then simply make a new array 
            int idx=0;
            int res[][] = new int [m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    res[i][j]=original[idx]; // 1d ko 2d me store kara diya
                    idx++;
                }
                
            }
            return res;
        }

        public static void main(String args[]){
            int original[] = {1,2,3,4};
            int m = 2;
            int n = 2;
            System.out.println(construct2DArray(original,m,n));
        }
}
