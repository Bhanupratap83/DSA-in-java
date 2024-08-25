import java.util.*;
public class SimplifyPath{
    // public static String simplifyPath(String path){
    //     String array[] = path.split("/");
    //     String output = "/";
    //     int i = 0;
    //     Stack<String> stack = new Stack<>();

    // }

    /*static String simplify(String path){
        Stack<String> s = new Stack<>();

        String res = "";
        res = res + "/";
        int n = path.length();
        
        for (int i = 0; i < n; i++){
            String str = "";
            while (i < n && path.charAt(i) == '/'){
                i++;
            }
            while (i < n && path.charAt(i) != '/'){
                str = str + path.charAt(i);
                i++;
            }
            if (str.equals("..") == true){
                if (!s.empty()){
                    s.pop();
                }
            }
            else if (str.equals(".") == true){
                continue;
            }
                else if (str.length() != 0){
                    s.push(str);
                }
        }

        Stack<String> st1 = new Stack<>();
        while (!s.empty()){
            st1.push(s.pop());
        }
        while (!st1.empty()) {
            if (st1.size() != 1) {
                res += (st1.pop() + "/");
            }   
            else {
                res += st1.pop();
            }
        }
        return res;
    }    */

    public static String simplifyString(String path){
        String arr[] = path.split("/");
        Stack<String> s = new Stack<>();
        for(String i : arr){
            if(i.equals("..") && !s.empty()){  // // suru me hi .. aa jae to kya hi pop karaenge to us time stack empty nahi hona chahiye
                s.pop();
            }  // ya to single dot aaega ya koi character aaega
             else if(!i.equals("") && i.equals(".") && !i.equals("..")){ //  // current string khali nahi honi chahiye jaise "//" && dot ko ignore krna h to dot honi hi nahi chahiye && agr empty nhi h string and double dot aa jae to usko bhi push nahi krna 
                s.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String i : s){
            sb.append("/");
            sb.append(i);   // jo data pda h vo hi
            
        }
        return sb.length() == 0 ? "/" : sb.toString(); // agr string ki length 0 h to / return krdo nhi to kuch to rahega to simply stringbuilder ko string me change krdo
        // // agr stack khali hi rha kaise example 4 me to dikkat ho jaegi isliye seedha sb.toString() nahi karenge phle length check karenge .... agr stringbuilder ki length 0 h to only single / print kra dijiye nahi to  sb.toString() to h hi
    }
}