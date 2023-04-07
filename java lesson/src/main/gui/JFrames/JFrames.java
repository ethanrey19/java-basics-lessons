package main.gui.JFrames;

import javax.swing.*;
import java.awt.*;

public class JFrames {
    public static void main(String[] args) {

        // JFrame = a GUI window to add components to.

        /*

        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("JFrame Title"); // sets the title of the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevents frame from being resized
        frame.setSize(400,400); // sets x and y of frame
        frame.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("logo.png"); // creates an image icon
        frame.setIconImage(image.getImage()); // changes icon of frame
        frame.getContentPane().setBackground(Color.blue); // changes color of frame

         */

        MyFrame frame = new MyFrame();
    }
}
