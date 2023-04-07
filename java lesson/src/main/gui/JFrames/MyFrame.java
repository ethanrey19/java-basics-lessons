package main.gui.JFrames;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("JFrame Title"); // sets the title of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevents frame from being resized
        this.setSize(400,400); // sets x and y of frame
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("logo.png"); // creates an image icon
        this.setIconImage(image.getImage()); // changes icon of frame
        this.getContentPane().setBackground(Color.blue); // changes color of frame
    }
}
