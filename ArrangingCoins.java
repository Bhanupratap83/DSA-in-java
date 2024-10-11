public class ArrangingCoins{
	public int arrangeCoins(int n) {
        long left=0, right = n;

        while(left<=right){
            long mid = left + (right-left) / 2;
            long c = mid * (mid + 1)/ 2;

            if(c == n){
                return (int) mid;
            }

            if(n < c){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) right;
    }
}