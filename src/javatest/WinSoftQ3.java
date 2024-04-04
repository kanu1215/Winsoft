package javatest;
import java.util.HashMap;
import java.util.Map;

public class WinSoftQ3 {

    public static void main(String[] args) {
        String inputString = "this is Q3 of winsoft technologies placement drive";

        // Remove punctuation and split the string into words
        String[] words = inputString.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        // Create a HashMap to store word counts
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count the words
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        // Display the word counts
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
