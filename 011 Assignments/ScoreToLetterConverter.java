import java.awt.*;
import java.awt.event.*;

public class ScoreToLetterConverter extends Frame {
    private Label scoreLabel;
    private TextField scoreTextField;
    private Button convertButton;
    private Label resultLabel;

    public ScoreToLetterConverter() {
        setTitle("Score to Letter Converter");
        setSize(300, 150);
        setLayout(new FlowLayout());

        scoreLabel = new Label("Enter Score:");
        scoreTextField = new TextField(10);
        convertButton = new Button("Convert");
        resultLabel = new Label("");

        add(scoreLabel);
        add(scoreTextField);
        add(convertButton);
        add(resultLabel);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the score input from the text field
                    String scoreStr = scoreTextField.getText();
                    double score = Double.parseDouble(scoreStr);

                    // Convert the score to a letter grade
                    String letterGrade = convertToLetterGrade(score);

                    // Display the result
                    resultLabel.setText("Letter Grade: " + letterGrade);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Enter a numeric score.");
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    private String convertToLetterGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        new ScoreToLetterConverter();
    }
}
