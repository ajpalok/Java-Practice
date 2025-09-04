// Write a program that takes a sentence as input and stores each word as an element in an 
// ArrayList. Then, change the second word (if it exists) to uppercase and print the modified ArrayList. 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSentence{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();
        input.close();
        ArrayList<String> sentenceList = new ArrayList<String>();
        String[] words = sentence.split(" ");
        
        sentenceList.addAll(Arrays.asList(words));

        if(sentenceList.size() >= 2){
            String secondWord = sentenceList.get(1);
            sentenceList.set(1, secondWord.toUpperCase());
        }
        System.out.println(sentenceList);
    }
}