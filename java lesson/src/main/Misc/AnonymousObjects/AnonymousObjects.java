package main.Misc.AnonymousObjects;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class AnonymousObjects {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        ArrayList<JLabel> deck = new ArrayList<JLabel>();

        deck.add(new JLabel(new ImageIcon("logo.png")));

        for(int i=1;i<52;i++){
            deck.add(new JLabel(new ImageIcon("logo.png")));
            frame.add(deck.get(i-1));
        }

        frame.add(deck.get(0));
        frame.add(deck.get(1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }
}
