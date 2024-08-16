public class GCD {
    public static int GCD(int nums[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n ; i++) {
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
        }

        for (int i = min; i >= 1; i--) {
            if (max % i == 0 && min % i == 0) {
                return i;
            }
        }
        return 1;
    }
    public static void main(String args[]){
        int nums[] = {2,5,6,9,10};
        System.out.println(GCD(nums));
    }
}
