
package collections;
import java.util.*;
 
public class AnagramGrouper {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
 
        Map<String, List<String>> anagramGroups = new HashMap<>();
 
        for (String str : strs) {
            // Convert string to char array, sort it, and convert back to string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
 
            // Check if sorted string is already in the map
            if (!anagramGroups.containsKey(sortedStr)) {
                anagramGroups.put(sortedStr, new ArrayList<>());
            }
 
            // Add the original string to the anagram group
            anagramGroups.get(sortedStr).add(str);
        }
 
        return new ArrayList<>(anagramGroups.values());
    }
 
    public static void main(String[] args) {
        AnagramGrouper grouper = new AnagramGrouper();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groups = grouper.groupAnagrams(input);
        System.out.println("Anagram Groups:");
        for (List<String> group : groups) {
            System.out.println(group);
        }
    }
}