# Abstract class and interface

1. Define an interface Playable with a method play(). Create an abstract class Instrument that 
implements Playable and has a field name. Create two classes Flute and Drum that extend 
Instrument and implement the play() method to display playing of respective instruments. 
2. Consider the code snippet below. What will be the output? Explain the behavior. 

```java
interface Worker { 
 void doWork(); 
} 
abstract class Employee implements Worker { 
 String name; 
 Employee(String name) { 
 this.name = name; 
 } 
 void introduce() { 
 System.out.println("Hi, I'm " + name); 
 } 
} 
class Manager extends Employee { 
 Manager(String name) { 
 super(name); 
 } 
 @Override 
 public void doWork() { 
 System.out.println(name + " (Manager) is managing tasks"); 
 } 
} 
public class EmployeeTest { 
 public static void main(String[] args) { 
 Worker worker = new Manager("Alice"); 
 worker.doWork(); 
 Employee employee = (Employee) worker; 
 employee.introduce(); 
 } 
}
```

# Exception handling, user-defined exceptions 

1. Revise the given code to execute without errors and predict the output of the program. 

```java
public class ExceptionExample { 
 int methodA() { 
 try { 
 throw new RuntimeException("Runtime exception from methodA"); 
 } catch (RuntimeException e) { 
 System.out.println(e.getMessage()); 
 } 
 System.out.println("After catch block"); 
 return 0; 
 } 
 void methodB() { 
 int result = methodA(); 
 if (result == 0) { 
 System.out.println("MethodB: result is zero."); 
 } else { 
 System.out.println("MethodB: result is " + result); 
 try { 
 throw new RuntimeException("Exception from else clause in methodB"); 
 } catch (RuntimeException e) { 
 System.out.println(e.getMessage()); 
 } 
 } 
 return; 
 } 
 boolean methodC(boolean value) { 
 if (!value) { 
 throw new RuntimeException("Exception in methodC"); 
 } 
 return false; 
 } 
 public static void main(String[] args) { 
 try { 
 ExceptionExample instance = new ExceptionExample(); 
 instance.methodC(false); 
 } catch (RuntimeException e) { 
 System.out.println(e.getMessage()); 
 try { 
 ExceptionExample instance2 = new ExceptionExample(); 
 instance2.methodB(); 
 } catch (RuntimeException e1) { 
 System.out.println(e1.getMessage()); 
 } 
 } 
 } 
}
```

2.Implement the search function in the following code. The search function tries to find an element 
using linear search. If the element is not present in the array, then it throws 
ElementNotFoundException. Also, you need to throw ArrayNotInitializeException if the given array 
has not been instantiated. 
```java
public class ArrayList { 
 int[] arr; 
 public boolean search(int element){ 
 // implement the code here 
 for(int i = 0; i< arr.length; i++){ 
 // implement the code here 
 } 
 // implement the code here 
 } 
} 
```

3. Refactor the given code to run without errors and predict the output of the program. 

```java
public class ExceptionChallenge { 
 static int methodA() { 
 try { 
 throw new CustomException("Custom exception from methodA"); 
 } catch (CustomException e) { 
 System.out.println(e.getMessage()); 
 } 
 System.out.println("After catch block"); 
 return 0; 
 } 
 static void methodB() { 
 int result = methodA(); 
 if (result == 0) { 
 System.out.println("MethodB: result is zero."); 
 } else { 
 System.out.println("MethodB: result is " + result); 
 try { 
 throw new CustomException("Exception from else clause in methodB"); 
 } catch (CustomException e) { 
 System.out.println(e.getMessage()); 
 } 
 } 
 } 
 static boolean methodC(boolean value) { 
 if (!value) { 
 throw new RuntimeException("Exception in methodC"); 
 } 
 return false; 
 } 
 public static void main(String[] args) { 
 try { 
 ExceptionChallenge.methodC(false); 
 } catch (RuntimeException e) { 
 System.out.println(e.getMessage()); 
 try { 
 ExceptionChallenge.methodB(); 
 } catch (CustomException e1) { 
 System.out.println(e1.getMessage()); 
 } 
 } 
 } 
} 
class CustomException extends Exception { 
 public CustomException(String message) { 
 super(message); 
 } 
}
```

# File and I/O 

1. You are given a file named "students.txt". Each line of the file contains information about a student, containing id, name, and score (divided by commas). The file looks like this: 

```txt
1,John,85 
2,Jane,92 
3,Michael,78 
4,Emily,95 
```

Write a function that will return the name of the student with the highest score. 

2. Write a program in Java to read the contents of a text file named "input.txt" and count the 
occurrences of each word. Write the word frequencies into another text file named 
"word_frequencies.txt". 

3. You are developing a simple quiz application. Each question in the quiz is stored in a file named 
"questions.txt". Each line in the file contains a question followed by its answer (separated by a 
comma). Write a program in Java to read the questions from the file and present them to the user. 
Get the user's answers and calculate their score. Display the final score at the end. 

# Collection(ArrayList, Hashset , collections.sort()) 

1. a) Write a program that takes a sentence as input and stores each word as an element in an 
ArrayList. Then, change the second word (if it exists) to uppercase and print the modified ArrayList. 
b) You are given a HashSet containing the names of students in a class. Add your name to the set if it 
doesn't already exist. 

2. You are given an ArrayList of integers. Write a program to remove all duplicates from the ArrayList 
and print the modified list. 

3. a) Write a program that takes a list of strings as input and sorts them in descending order of their lengths using the Collections.sort() method.  
b) You are given an ArrayList of Book objects. Each Book has attributes title, author, and pages. 
Write a program that sorts the ArrayList of books in descending order of the number of pages. If two 
books have the same number of pages, they should be sorted in ascending order of their authors' 
names. 

4. Write a program to find the union of two HashSet objects and print the result. 

5. You are given an ArrayList of Person objects. Each Person has attributes name, age, and salary. 
Write a program to sort the ArrayList in ascending order of age. If two persons have the same age, 
sort them in descending order of salary. 

6. You are creating a file indexing system for a search engine. Given an ArrayList of File objects, 
where each File has attributes fileName, keywords (HashSet of strings), and size (in bytes), write a 
program that searches for files based on keywords and ranks them in descending order of relevance. 
The relevance of a file is determined by the number of matching keywords. 

7. You are given an ArrayList of strings containing sentences. Write a program to count the 
frequency of each word across all sentences and print the words along with their frequencies in 
descending order of frequency. 

# Threading 

1. Create a thread class named CustomExceptionThread that simulates a task and throws a 
custom exception called TaskFailedException if the task fails. Handle the custom exception in 
the main method. 

2. Create a thread class named SumThread that takes an array arr, an index left, and an index 
right in its constructor. The thread should compute the sum of elements in the array from 
index left to index right inclusive. Implement the necessary code to start three SumThread 
objects concurrently and calculate the total sum. 

# Awt/GUI 

1. Create a Java GUI application that acts as a simple quiz game. The GUI should display a 
question and multiple-choice answers. When the user selects an answer and clicks the 
"Submit" button, the application should show whether the answer is correct or not. Keep a 
track of the user's score and display it. Use exception handling to handle any unexpected 
inputs or errors. 

2.a) Write the code to get a Java GUI application like the image below that has the functionality 
of converting Score to Letter after pressing the Convert button. Assume all the packages are 
imported. User can input decimal numbers in the input fields. 

b) In the previous code of Question (a), add another button ShowRemark beside the previous 
button. Now, if ShowRemark is pressed, the Remark will be show along with the grade. Just write the 
updated/added codes over Question (a) 
Here are the Grades, sores and Corresponding Remarks: 

|   Letter   |    Grade     | Remarks Marks (%) |
|:----------:|:------------:|:-----------------:|
| A (Plain)  | Excellent    | 90 -100           | 
| A- (Minus) | Very Good    | 86 – 89           |
| B+ (Plus)  | Good         | 82 – 85           |
| B (Plain)  | Satisfactory | 78 – 81           |
| B- (Minus) | Satisfactory | 74 -77            |
| C+ (Plus)  | Try Harder   | 70 – 73           |
| C (Plain)  | Try Harder   | 66 – 69           |
| C- (Minus) | Try Harder   | 62 – 65           |
