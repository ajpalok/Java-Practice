// Write a program that takes a list of strings as input and sorts them in descending order of their 
// lengths using the Collections.sort() method.

import java.util.*;

public class ListOfString{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of strings: ");
        String line = input.nextLine();
        String[] words = line.split(" ");
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.addAll(Arrays.asList(words));

        Comparator<String> compare = new Comparator<>(){
            @Override
            public int compare(String s1, String s2){
                return Integer.compare(s2.length(), s1.length());
            }
        };

        wordList.sort(compare);

        System.out.println(wordList);
    }
}