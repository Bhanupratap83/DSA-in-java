public class NumberofStringsThatAppearAsSubstringsInWord{
    // Agar tumhe manual substring check karna hai, toh yeh logic sahi rahega:
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (String pattern : patterns) {
            if (isSubstring(word, pattern)) {
                count++;
            }
        }

        return count;
    }

    private boolean isSubstring(String word, String pattern) {
        int wordLen = word.length();
        int patternLen = pattern.length();

        for (int i = 0; i <= wordLen - patternLen; i++) {
            int j;
            for (j = 0; j < patternLen; j++) {
                if (word.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == patternLen) {
                return true;
            }
        }

        return false;
    }
}

