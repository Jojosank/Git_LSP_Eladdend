package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;
import java.util.Map;

public class Driver {
    	
	public static void main(String[] args) {
		ReadFile fr = new ReadFile();
		try {
			String fileContent = fr.readToString("main/java/resources/words.txt");
            
			// Create an instance of WordFreq and pass the fileContent
			WordFreq wordFreq  = new WordFreq(fileContent);
			
			//Get counts of all words from the WordFreq instance
			Map<String, Integer> allWordCounts = wordFreq.getAllWordCounts();
			
			//Print all word counts
			for (Map.Entry<String, Integer> entry : allWordCounts.entrySet()) {
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open resource");
		}
		
	}

}

