class Solution {
    public int strStr(String haystack, String needle) {
        // Edge case: needle is empty
        if (needle.isEmpty()) {
            return 0;
        }

        // Edge case: needle is longer than haystack
        if (needle.length() > haystack.length()) {
            return -1;
        }

        char ch = needle.charAt(0); // First character of needle
        int i = 0;
        int left = 0;

        while (i < haystack.length()) {
            left = i;

            // Check if the first character matches
            if (haystack.charAt(i) == ch) {
                int j = 0;

                // Start comparing the needle with the substring of haystack
                while (j < needle.length()) {
                    // Mismatch found
                    if (i >= haystack.length() || haystack.charAt(i) != needle.charAt(j)) {
                        i = left + 1; // Reset i to left + 1 for the next iteration
                        break;
                    }
                    i++;
                    j++;
                }

                // If the entire needle is matched
                if (j == needle.length()) {
                    return left;
                }
            } else {
                // Move to the next character in haystack
                i++;
            }
        }
        return -1; // Needle not found in haystack
    }
}
