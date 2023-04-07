package main.gui.TwoDGraphics;

import javax.swing.*;

public class TwoDGraphics extends JFrame{

    MyPanel panel;

    TwoDGraphics(){

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
