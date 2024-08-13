public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        int n = words.length;
        String ans = words[n-1];
        int count = ans.length();
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
}
