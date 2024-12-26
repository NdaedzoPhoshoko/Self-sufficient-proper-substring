import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        System.out.println(findLongestLength("amazonservices")); // Output: 11
    }
    
    public static int findLongestLength(String fullString) {
        int n = fullString.length();
        if (n < 2) {
            return 0; // No proper substrings possible
        }

        int maxLength = 0;

        // Iterate over all possible substrings
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                if (end - start + 1 < n) { // Ensure it's a proper substring
                    HashSet<Character> inside = new HashSet<>();
                    HashSet<Character> outside = new HashSet<>();

                    // Add characters outside the substring to the "outside" set
                    for (int i = 0; i < n; i++) {
                        if (i < start || i > end) {
                            outside.add(fullString.charAt(i));
                        }
                    }

                    // Add characters inside the substring to the "inside" set
                    for (int i = start; i <= end; i++) {
                        inside.add(fullString.charAt(i));
                    }

                    // Check if there's any overlap between inside and outside sets
                    boolean isSelfSufficient = true;
                    for (char c : inside) {
                        if (outside.contains(c)) {
                            isSelfSufficient = false;
                            break;
                        }
                    }

                    // Update maxLength if the substring is self-sufficient
                    if (isSelfSufficient) {
                        maxLength = Math.max(maxLength, end - start + 1);
                    }
                }
            }
        }

        return maxLength;
    }
}
