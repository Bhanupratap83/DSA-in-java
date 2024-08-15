
import java.util.Arrays;

//anagram :- ek word ke letter se doosra word banana vo bhi meaningfull hona chahiye
// Same character but in different order eg.race and care 

// 1. both the string should be in lowercase to compare
// 2. no. of char or length in both the string should be same
// 3.  convert the string into new char array and sort them
// 4. if both sorted array are equal then they are anagram otherwise not
public class anagramString {
    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray(); //toCharArray() is used to convert which is stored in str1charArray named array

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println( str1 + " and " + str2 + " are anagrams of each other");
            } else {
                System.out.println( str1 + " and " + str2 + " are not anagrams of each other");
            }

        } else {
            System.out.println(str1 + "and" + str2 + "are not anagram of each other");
        }
    }
}
