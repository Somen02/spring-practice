package basic;
public class SmallestStringWithSubstring {

    public static String findSmallestString(String word, String substr) {
        int n = word.length();
        int m = substr.length();
        String smallestString = null;

        for (int i = 0; i <= n - m; i++) {
            // Check if substr can be placed starting at position i
            boolean canPlace = true;
            for (int j = 0; j < m; j++) {
                if (word.charAt(i + j) != '?' && word.charAt(i + j) != substr.charAt(j)) {
                    canPlace = false;
                    break;
                }
            }

            if (canPlace) {
                // Generate candidate string with substr placed at position i
                String candidate = replaceQuestionMarks(word, substr, i, i + m);
                if (smallestString == null || candidate.compareTo(smallestString) < 0) {
                    smallestString = candidate;
                }
            }
        }

        return smallestString == null ? "-1" : smallestString;
    }

    private static String replaceQuestionMarks(String word, String substr, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < start; i++) {
            if (word.charAt(i) == '?') {
                sb.append('a');
            } else {
                sb.append(word.charAt(i));
            }
        }
        sb.append(substr);
        for (int i = end; i < word.length(); i++) {
            if (word.charAt(i) == '?') {
                sb.append('a');
            } else {
                sb.append(word.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word = "ab?c??";
        String substr = "bcd";
        System.out.println(findSmallestString(word, substr)); // interview.Example output: "abbcda"
    }
}