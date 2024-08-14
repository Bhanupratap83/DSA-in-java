public class buyandsellStocks {
    
    public static int buyandsellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){ //profit
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit,profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;

    }

    // trying to solve que 840 of leetcode
    public static int numMagicSquaresInside(int[][] grid) {
        int count =0;
        int sum = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(i == j && i+j == grid.length && i+j <= grid.length-1){
                    sum += grid[i][j];
                    count++;
                } else {
                    return count;
                }
            }
        }
        return count;
    }
    // public static void main(String args[]){
    //     int grid[][] ={{4,3,8},{9,5,1},{2,7,6}};
    //     System.out.println(numMagicSquaresInside(grid));
    // }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyandsellStocks(prices));
    }
}
