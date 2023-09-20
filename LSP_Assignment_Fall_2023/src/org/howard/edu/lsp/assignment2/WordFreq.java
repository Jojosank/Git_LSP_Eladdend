package org.howard.edu.lsp.assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordFreq {
    private Map<String, Integer> wordCounts;

    public WordFreq(String inputText) {
        wordCounts = new HashMap<>();
        processInputText(inputText);
    }

    private void processInputText(String inputText) {
        StringTokenizer tokenizer = new StringTokenizer(inputText, " .,!?\"':;()[]{}\\/\n\t");
        
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            
            // Check if the word consists only of alphabetic characters
            if (isAlphabetic(word)) {
                // Only count words with a length greater than 3
                if (word.length() > 3) {
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }
        }
    }

    private boolean isAlphabetic(String word) {
        // Use regular expression to check if the word consists only of alphabetic characters
        return word.matches("^[a-zA-Z]*$");
    }

    public Map<String, Integer> getAllWordCounts() {
        return wordCounts;
    }
}
