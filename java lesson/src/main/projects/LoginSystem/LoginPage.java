package main.projects.LoginSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage{

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField passIDField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID: ");
    JLabel passIDLabel = new JLabel("password: ");
    JLabel messageLabel = new JLabel();

    HashMap<String,String> loginInfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginInfoOG){

        loginInfo = loginInfoOG;

        userIDLabel.setBounds(50,100,75,25);

        passIDLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        userIDField.setBounds(125,100,200,25);

        passIDField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==loginButton){

                    String userID = userIDField.getText();
                    String passID = String.valueOf(passIDField.getPassword());

                    if(loginInfo.containsKey(userID)){
                        if(loginInfo.get(userID).equals(passID)){
                            messageLabel.setForeground(Color.GREEN);
                            messageLabel.setText("Login Successful");
                            WelcomePage welcomePage = new WelcomePage(userID);
                            frame.dispose();
                        }
                    }else {
                        messageLabel.setForeground(Color.RED);
                        messageLabel.setText("Username or Password not found");
                    }
                }
            }
        });

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource()==resetButton){
                    userIDField.setText("");
                    passIDField.setText("");
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.add(userIDLabel);
        frame.add(passIDLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(passIDField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setVisible(true);
    }
}
