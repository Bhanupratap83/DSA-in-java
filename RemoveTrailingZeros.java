public class RemoveTrailingZeros {
    public static String remove(String num){
        int intNum = Integer.parseInt(num);
        while (intNum % 10 == 0 && intNum != 0) {
            intNum /= 10;
        }
        String strNum = Integer.toString(intNum);
        return strNum;
    }
    public static void main(String[] args) {
        String num = "1720865079269529096765717822459";
        System.out.println(remove(num));
        
    }
}
