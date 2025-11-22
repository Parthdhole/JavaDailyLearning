package com.DailyPractice;

   public class SentanceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        // Boolean array to track all 26 letters
        boolean[] seen = new boolean[26];

        // Mark each character
        for (char c : sentence.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                seen[c - 'a'] = true; // mark that letter as present
            } else if (c >= 'A' && c <= 'Z') {
                seen[c - 'A'] = true; // handle uppercase also
            }
        }

        // Check if all 26 are present
        for (boolean b : seen) {
            if (!b) return false;
        }
        return true;
    }
}
