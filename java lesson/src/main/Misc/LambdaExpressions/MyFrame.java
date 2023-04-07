package main.Misc.LambdaExpressions;

import javax.swing.*;

public class MyFrame extends JFrame {

    JButton myButton = new JButton("MY BUTTON");
    JButton myButton2 = new JButton("MY BUTTON 2");

    MyFrame(){

        myButton.setBounds(100,100,200,100);
        myButton.setFocusable(false);
        myButton.addActionListener(

            (e) -> System.out.println("You clicked the button")


        );

        myButton2.setBounds(100,200,200,100);
        myButton2.setFocusable(false);
        myButton2.addActionListener(
                (e) -> System.out.println("This is the second button")
        );

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(myButton);
        this.add(myButton2);
        this.setVisible(true);
    }

}
