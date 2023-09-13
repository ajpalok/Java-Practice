// You are given a HashSet containing the names of students in a class. Add your name to the set if it 
// doesn't already exist. 

import java.util.*;

public class StudentNames{
    public static void main(String[] args) {
        HashSet<String> studentNames = new HashSet<>();
        studentNames.add("Sumaya");
        studentNames.add("Abrar");
        studentNames.add("Shopnil");
        studentNames.add("George");
        studentNames.add("Alif");
        studentNames.add("Urmi");
        studentNames.add("Jinia");
        studentNames.add("Jenin");

        if(!studentNames.contains("John")){
            studentNames.add("John");
        }
        System.out.println(studentNames);
    }
}