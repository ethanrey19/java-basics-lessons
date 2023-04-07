package main.gui.JRadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ImageIcon icon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        icon = new ImageIcon("logo.png");

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.setIcon(icon);
        hamburgerButton.setIcon(icon);
        hotdogButton.setIcon(icon);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==pizzaButton){
            System.out.println("You ordered a pizza!");
            pizzaButton.setEnabled(false);
        }

        else if(e.getSource()==hamburgerButton){
            System.out.println("You ordered a hamburger!");
            hamburgerButton.setEnabled(false);
        }
        else if(e.getSource()==hotdogButton){
            System.out.println("You ordered a hot dog!");
            hotdogButton.setEnabled(false);
        }
    }
}
