public class MergeStringsAlternatively{
    public String mergeAlternately(String word1, String word2) {
        StringBuilder word3 = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();

        int n = Math.min(n1, n2);
        for(int i=0; i<n; i++){
            word3.append(word1.charAt(i));
            word3.append(word2.charAt(i));
        }

        if(n1 > n){
            word3.append(word1.substring(n));
        } else if(n2 > n){
            word3.append(word2.substring(n));
        }
        return word3.toString();
    }
}