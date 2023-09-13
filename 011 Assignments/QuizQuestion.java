// You are developing a simple quiz application. Each question in the quiz is stored in a file named 
// "questions.txt". Each line in the file contains a question followed by its answer (separated by a 
// comma). Write a program in Java to read the questions from the file and present them to the user. 
// Get the user's answers and calculate their score. Display the final score at the end. 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

class QuizQuestion{
    public static void main(String[] args) {
        try{
            File inputFile = new File("questions.txt");
            Scanner reader = new Scanner(inputFile);
            ArrayList<String> questionList = new ArrayList<String>();
            ArrayList<String> answerList = new ArrayList<String>();
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] questions = line.split(",");
                for(String question : questions){
                    questionList.add(question);
                }
                for(String answer : questions){
                    answerList.add(answer);
                }
                for(String question : questionList){
                    System.out.println(question);
                }
                for(String answer : answerList){
                    System.out.println(answer);
                }
                reader.close();
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}