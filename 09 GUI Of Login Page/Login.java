import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener{
    int
        width = 500,
        height = 500,
        row = height/6,
        col = width/6;


    JFrame frame = new JFrame("Login", null);
    JLabel usernameLabel = new JLabel("Username: ");
    JTextField usernameField = new JTextField("ajpalok");
    JLabel passwordLabel = new JLabel("Password");
    JTextField passwordField = new JTextField();
    JButton loginButton = new JButton("Login");
    public Login(){
        usernameLabel.setBounds(col*1, row*1, col*(1+1/2), row*1);
        usernameField.setBounds(col*3, row*1, col*2, row*1);
        
        passwordLabel.setBounds(col*1, row*2, col*(1+1/2), row*1);
        passwordField.setBounds(col*3, row*2, col*2, row*1);

        loginButton.setBounds(col*2, row*4, col*2, row*1);

        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);

        loginButton.addActionListener(this);

        frame.setSize(width, height);
        frame.setLocation(1350, 50);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        if(usernameField.getText().equals("ajpalok")&&passwordField.getText().equals("123")) System.out.println("You make it broo");
        else System.out.println("Looser");
    }

    public static void main(String[] args) {
        new Login();
    }
}
