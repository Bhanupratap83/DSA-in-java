import java.util.*;
public class ValidParenthesis {

    public static boolean validParenthesis(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //opening brackets
            if(ch == '(' || ch == '[' || ch == '{'){
                s.push(ch);
            } else {
                // agr khali hi h string 
                if(s.isEmpty()){
                    return false;
                }
                // closing brackets
                if((s.peek() == '(' && ch == ')') ||
                    (s.peek() == '[' && ch == ']') ||
                    (s.peek() == '{' && ch == '}') ) {
                       s.pop();     
                } else {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({})[]";
        System.out.println(validParenthesis(str));
    }
}
