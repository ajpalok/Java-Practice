// You are given an ArrayList of strings containing sentences. Write a program to count the 
// frequency of each word across all sentences and print the words along with their frequencies in 
// descending order of frequency. 

import java.util.*;

public class WordFrequencyListOrder{
    public static void main(String[] args) {
        ArrayList<String> sentenceList = new ArrayList<String>();
        sentenceList.add("I am a student");
        sentenceList.add("I am a teacher");
        sentenceList.add("I am a student");

        HashSet<String> wordSet = new HashSet<String>();
        for(String sentence : sentenceList){
            String[] words = sentence.split(" ");
            for(String word : words){
                wordSet.add(word);
            }
        }

        ArrayList<String> wordList = new ArrayList<String>();
        for(String word : wordSet){
            wordList.add(word);
        }

        Comparator<String> compare = new Comparator<>(){
            @Override
            public int compare(String w1, String w2){
                int count1 = 0;
                int count2 = 0;
                for(String sentence : sentenceList){
                    String[] words = sentence.split(" ");
                    for(String word : words){
                        if(word.equals(w1)){
                            count1++;
                        }
                        if(word.equals(w2)){
                            count2++;
                        }
                    }
                }
                if(count1 == count2){
                    return w1.compareTo(w2);
                }
                return Integer.compare(count2, count1);
            }
        };

        Collections.sort(wordList, compare);

        for(String word : wordList){
            System.out.println(word);
        }
    }
}