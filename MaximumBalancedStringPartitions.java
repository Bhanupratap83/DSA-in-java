public class MaximumBalancedStringPartitions {
    public static int  balancedPatition(String str, int n){
        if(n == 0){
            return 0;
        }

        int r=0, l=0;
        int count = 0;
        for(int i=0; i<n; i++){
            if(str.charAt(i) == 'R'){
                r++;
            } else if(str.charAt(i) == 'L'){
                l++;
            }
            if(r == l){
                count++;
                r = 0;
                l = 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";
        int n = str.length();

        System.out.println(balancedPatition(str, n));
    }
}
