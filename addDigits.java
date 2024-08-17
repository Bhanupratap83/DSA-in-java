public class addDigits {
    public static int addDigits(int num){
        int last = num % 10;
        int first = num;
        while(first > 10){
            first = first / 10;
        }
        int res = last+ first;
        while(res > 10){
            res = res / 10 + res % 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }
}
