package collections;

import java.util.HashMap;
import java.util.Map;

public class KAnagramChecker {
    public static boolean areKAnagrams(String s1, String s2, int k) {
        // Check if lengths are different
        if (s1.length() != s2.length()) {
            return false;
        }

        // Count the frequency of each character in both strings
        Map<Character, Integer> charCount1 = getCharacterCount(s1);
        Map<Character, Integer> charCount2 = getCharacterCount(s2);

        // Compare the character frequencies and calculate the total differences
        int totalDifferences = 0;
        for (char c : charCount1.keySet()) {
            int count1 = charCount1.getOrDefault(c, 0);
            int count2 = charCount2.getOrDefault(c, 0);
            totalDifferences += Math.abs(count1 - count2);
        }

        // Check if the total differences can be covered by k swaps
        return totalDifferences / 2 <= k;
    }

    private static Map<Character, Integer> getCharacterCount(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return charCount;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bca";
        int k = 2;

        boolean result = areKAnagrams(str1, str2, k);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" " + k + "-anagrams? " + result);
    }
}
