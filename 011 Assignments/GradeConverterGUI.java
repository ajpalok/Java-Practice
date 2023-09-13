//  Write the code to get a Java GUI application like the image below that has the functionality 
// of converting Score to Letter after pressing the Convert button. Assume all the packages are 
// imported. User can input decimal numbers in the input fields. 
// b) In the previous code of Question (a), add another button ShowRemark beside the previous 
// button. Now, if ShowRemark is pressed, the Remark will be show along with the grade. Just write the 
// updated/added codes over Question (a)

// Here are the Grades, sores and Corresponding Remarks:

// Letter Grade Remarks Marks (%)
// A (Plain) Excellent 90 -100
// A- (Minus) Very Good 86 – 89
// B+ (Plus) Good 82 – 85
// B (Plain) Satisfactory 78 – 81
// B- (Minus) Satisfactory 74 -77
// C+ (Plus) Try Harder 70 – 73
// C (Plain) Try Harder 66 – 69
// C- (Minus) Try Harder 62 – 65


import java.awt.*;
import java.awt.event.*;

public class GradeConverterGUI extends Frame implements ActionListener{
    Label scoreLabel;
    Label gradeLabel;
    Button convert;
    Button showRemark;
    TextField score;
    Label grade;
    Label remark;

    public GradeConverterGUI(){
        setLayout(new FlowLayout());
        scoreLabel = new Label("Score");
        add(scoreLabel);
        score = new TextField(10);
        add(score);
        gradeLabel = new Label("Grade");
        add(gradeLabel);
        grade = new Label("");
        add(grade);
        convert = new Button("Convert");
        add(convert);
        showRemark = new Button("Show Remark");
        add(showRemark);
        remark = new Label("");
        add(remark);
        convert.addActionListener(this);
        showRemark.addActionListener(this);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }

    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == convert){
            double scoreValue = Double.parseDouble(score.getText());
            if(scoreValue >= 90 && scoreValue <= 100){
                grade.setText("A");
            } else if(scoreValue >= 86 && scoreValue <= 89){
                grade.setText("A-");
            } else if(scoreValue >= 82 && scoreValue <= 85){
                grade.setText("B+");
            } else if(scoreValue >= 78 && scoreValue <= 81){
                grade.setText("B");
            } else if(scoreValue >= 74 && scoreValue <= 77){
                grade.setText("B-");
            } else if(scoreValue >= 70 && scoreValue <= 73){
                grade.setText("C+");
            } else if(scoreValue >= 66 && scoreValue <= 69){
                grade.setText("C");
            } else if(scoreValue >= 62 && scoreValue <= 65){
                grade.setText("C-");
            } else {
                grade.setText("F");
            }
        } else if(e.getSource() == showRemark){
            String gradeValue = grade.getText();
            if(gradeValue.equals("A")){
                remark.setText("Excellent");
            } else if(gradeValue.equals("A-")){
                remark.setText("Very Good");
            } else if(gradeValue.equals("B+")){
                remark.setText("Good");
            } else if(gradeValue.equals("B")){
                remark.setText("Satisfactory");
            } else if(gradeValue.equals("B-")){
                remark.setText("Satisfactory");
            } else if(gradeValue.equals("C+")){
                remark.setText("Try Harder");
            } else if(gradeValue.equals("C")){
                remark.setText("Try Harder");
            } else if(gradeValue.equals("C-")){
                remark.setText("Try Harder");
            } else {
                remark.setText("Fail");
            }
        }
    }

    public static void main(String[] args) {
        GradeConverterGUI gradeConverter = new GradeConverterGUI();
        gradeConverter.setSize(600, 200);
        gradeConverter.setTitle("Grade Converter");
        gradeConverter.setVisible(true);
    }
}