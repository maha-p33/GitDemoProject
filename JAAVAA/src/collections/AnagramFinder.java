package collections;
import java.util.*;

public class AnagramFinder {
    public List<String> findAnagrams(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        // Map to store frequency of characters in the input string
        Map<Character, Integer> charFreq = new HashMap<>();
        // Initialize character frequency map
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        // Iterate through the string to find anagrams
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                // Create a substring from i to j (inclusive)
                String substring = s.substring(i, j + 1);
                // Check if the substring is an anagram
                if (isAnagram(substring, charFreq)) {
                    result.add(substring);
                }
            }
        }
        return result;
    }
    // Helper method to check if a string is an anagram
    private boolean isAnagram(String s, Map<Character, Integer> charFreq) {
        Map<Character, Integer> tempFreq = new HashMap<>(charFreq);
        for (char c : s.toCharArray()) {
            if (!tempFreq.containsKey(c) || tempFreq.get(c) == 0) {
                return false;
            }
            tempFreq.put(c, tempFreq.get(c) - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        AnagramFinder finder = new AnagramFinder();
        String input = "abc";
        List<String> anagrams = finder.findAnagrams(input);
        System.out.println("Anagrams in the string \"" + input + "\": " + anagrams);
    }
}