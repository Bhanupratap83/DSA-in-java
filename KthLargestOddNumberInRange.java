public class KthLargestOddNumberInRange {

    public static int KthOdd(int L, int R, int k){
        int totalNumbers = R-L+1;
        int numberOfOddNumbers;

        if(L%2 != 0 && R%2 != 0){
            numberOfOddNumbers = (totalNumbers/2) + 1;
        } else{
            numberOfOddNumbers = (totalNumbers/2);
        }

        if(k > numberOfOddNumbers){
            return 0; // itne to total numbers hi nahi h
        }

        int largestValue;
        if(R%2 != 0){
            largestValue = R;
        } else{
            largestValue = R-1;
        }

        return largestValue - (2*(k-1));
    }
    public static void main(String[] args) {
        // int p[] = {-10, 10};
        int k = 2;
        System.out.println(KthOdd(-3, 3, k));
    }
}
