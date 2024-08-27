import java.util.*;
public class LongestCommonPrefix {
    public String longestCommonPrefix(String str[]){
        int minLength = Integer.MAX_VALUE;
        for(String st : str){
            if(st.length() < minLength){
                minLength = st.length();
            }
        }

        int i = 0;
        while(i < minLength){
            for(String st : str){
                if(st.charAt(i) != str[0].charAt(i)){
                    return str[0].substring(0,i);
                }
            }
            i++;
        }
        return str[0].substring(0,i);
    }
}
