import java.util.*;
public class MinimumAddToMakeParenthesisValid{
    public static int minToAdd(String s){
        int count = 0;
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            } else {
                if(st.isEmpty()){
                    count++;
                } else {
                    st.pop();
                }
            }
        }
        return count+st.size();
    }
    public static void main(String[] args) {
        String s = "())";
        System.out.println(minToAdd(s));
    }
}