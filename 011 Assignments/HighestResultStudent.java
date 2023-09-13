// You are given a file named "students.txt". Each line of the file contains information about a 
// student, containing id, name, and score (divided by commas). The file looks like this: 
// 1,John,85 
// 2,Jane,92 
// 3,Michael,78 
// 4,Emily,95 
// Write a function that will return the name of the student with the highest score.


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HighestResultStudent{
  int highestScore = 0;
  String highestScoreName = "";
  
  public String highestResult(){
    try{
        File studentData = new File("students.txt");
        Scanner reader = new Scanner(studentData);
            while (reader.hasNextLine() == true) {
                String line = reader.nextLine();
                String[] data = line.split(",");
                int studentScore = Integer.parseInt(data[2]);
                if (studentScore > highestScore) {
                    highestScore = studentScore;
                    highestScoreName = data[1];
                }
                reader.close();
            }
            }catch (IOException e) {
                // System.out.println(e.getMessage());
                e.printStackTrace();
        }
        return highestScoreName + " has highest score of "  + highestScore;
    }
}