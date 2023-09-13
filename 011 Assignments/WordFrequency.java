// Write a program in Java to read the contents of a text file named "input.txt" and count the 
// occurrences of each word. Write the word frequencies into another text file named 
// "word_frequencies.txt".


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        int count = 0;
        try{
            File inputFile = new File("input.txt");
            // File outputFile = new File("word_frequencies.txt");
            Scanner reader = new Scanner(inputFile);
            // Scanner writer = new Scanner(outputFile);
            ArrayList<String> wordList = new ArrayList<String>();
            HashSet <String> checkWord = new HashSet<String>();
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] words = line.split(" ");
                

                for(String word : words){
                    checkWord.add(word);
                }

                // for(String word : words){
                //     wordList.add(word);
                // }

                for(String word : wordList){
                    System.out.println(word + " " + checkWord.size());
                }
                reader.close();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Word Frequency: " + count);
    }
}
