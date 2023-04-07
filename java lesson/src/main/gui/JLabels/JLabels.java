package main.gui.JLabels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabels {
    public static void main(String[] args) {

        // JLabel = a GUI display area for a string a text, an image, or both

        ImageIcon imageIcon = new ImageIcon("logo.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);

        JLabel label = new JLabel(); // create a label
        label.setText("hey, hello!"); // set text of label
        label.setIcon(imageIcon);
        label.setHorizontalTextPosition(JLabel.CENTER); // changes text position on the frame
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli", Font.PLAIN,50)); // sets font of text
        label.setIconTextGap(50); // set gap of text to image
        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // sets vertical pos of icon+text in label
        label.setHorizontalAlignment(JLabel.CENTER); // sets horizontal pos of icon+text in label
        //label.setBounds(100,100,250,250); // sets x + y pos within frame and dimensions


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(500,500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label); // adds label to the frame
        frame.pack();
    }
}
