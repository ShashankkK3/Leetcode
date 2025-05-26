import java.util.HashMap;
import java.util.TreeMap;

class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        TreeMap<Integer, String> hm = new TreeMap<>(); // Use TreeMap for sorting
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int key = Character.getNumericValue(c);
                hm.put(key, word.toString());
                word.setLength(0); // Reset word
            } else if (c == ' ') {
                // Do nothing here, word is handled when digit is found
            } else {
                word.append(c);
            }
        }
        // Handle the last word
       

        StringBuilder result = new StringBuilder();
        for (String w : hm.values()) {
            result.append(w).append(" ");
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 1); // Remove trailing space
        }

        return result.toString();
    }
}