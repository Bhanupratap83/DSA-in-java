class HappyNumber {
    public boolean isHappy(int n) {
        int sum = n, x = n;
        while(sum > 9){
            sum = 0;
            while(x > 0){
                int digit = x % 10;
                sum = sum + digit * digit;
                x = x / 10;
            }
            x = sum;
        }
        if(sum == 1 || sum == 7){
            return true;
        }
        return false;
    }
}