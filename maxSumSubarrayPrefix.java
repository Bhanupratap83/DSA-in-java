public class maxSumSubarrayPrefix {
    public static void maxsubArraySum(int numbers[]){
        int currSum;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];

        prefix[0]=numbers[0];
        //calculate prefix array..
        for(int i=1; i<numbers.length; i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j< numbers.length; j++){
                currSum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                // for(int k=i; k<=j; k++){
                //     // System.out.print(numbers[k]+" ");
                //     currSum+=numbers[k];
                // }
                // System.out.println(currSum);

                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("max sum is : "+maxSum);
        }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        maxsubArraySum(numbers);
    }
    
}
