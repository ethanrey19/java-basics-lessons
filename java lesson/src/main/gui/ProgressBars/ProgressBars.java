package main.gui.ProgressBars;

import javax.swing.*;
import java.awt.*;

public class ProgressBars {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,500);

    ProgressBars(){

        bar.setValue(0);
        bar.setBounds(0,0,500,50);
        bar.setStringPainted(true); // adds percentage to bar
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.red); // changes bar color
        bar.setBackground(Color.black); // changes background color

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill(){
        int counter = 500;

        while(counter>0){

            bar.setValue(counter);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter-=1;
        }
        bar.setString("You Died"); // text after reaches 100%
    }

}
