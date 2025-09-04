// Create a Java GUI with only AWT application that acts as a simple quiz game. The GUI should display a 
// question and multiple-choice answers. When the user selects an answer and clicks the 
// "Submit" button, the application should show whether the answer is correct or not. Keep a 
// track of the user's score and display it. Use exception handling to handle any unexpected 
// inputs or errors.

import java.awt.*;
import java.awt.event.*;

public class SimpleQuizGUI extends Frame implements ActionListener{
    Label question;
    CheckboxGroup answers;
    Checkbox answer1;
    Checkbox answer2;
    Checkbox answer3;
    Checkbox answer4;
    Button submit;
    Label result;
    int score = 0;

    public SimpleQuizGUI(){
        setLayout(new FlowLayout());
        question = new Label("What is the capital of Bangladesh?");
        add(question);
        answers = new CheckboxGroup();
        answer1 = new Checkbox("Dhaka", answers, false);
        add(answer1);
        answer2 = new Checkbox("Barishal", answers, false);
        add(answer2);
        answer3 = new Checkbox("Faridpur", answers, false);
        add(answer3);
        answer4 = new Checkbox("Madaripur", answers, false);
        add(answer4);
        submit = new Button("Submit");
        add(submit);
        result = new Label("");
        result.setBounds(100, 100, 100, 100);
        add(result);
        submit.addActionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e){
        if(answer1.getState()){
            result.setText("Correct! Score:" + 1);
        } else {
            result.setText("Incorrect!");
        }
    }

    public static void main(String[] args) {
        SimpleQuizGUI quiz = new SimpleQuizGUI();
        quiz.setSize(600, 200);
        quiz.setTitle("Simple Quiz");
        quiz.setVisible(true);
    }
}