import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
class GUI implements ActionListener{
    JFrame jFrame = new JFrame();
    JTextField num1 = new JTextField();
    JTextField num2 = new JTextField();
 
    JTextField output = new JTextField();
 
    JButton add = new JButton();
    JButton sub = new JButton();
 
 
    public GUI(){
        num1.setBounds(150,100,100,50);
        num2.setBounds(300,100,100,50);
        add.setBounds(175,300,50,50);
        sub.setBounds(325,300,50,50);
        output.setBounds(250,400,50,50);
 
        add.setText("+");
        sub.setText("-");
 
 
        add.addActionListener(this);
        sub.addActionListener(this);
 
        jFrame.add(num1);
        jFrame.add(num2);
        jFrame.add(add);
        jFrame.add(sub);
        jFrame.add(output);
        jFrame.setLocation(100,50);
        jFrame.setSize(600,600);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == add){
            int a = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
            output.setText(Integer.toString(a));
        }
        else{
 
            int a = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
            output.setText(Integer.toString(a));
        }
    }
}
 
 
 
public class Main {
    public static void main(String args[]) {
        new GUI();
    }
}