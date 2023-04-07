package main.gui.TwoDAnimation;

import javax.swing.*;

public class AnimationFrame extends JFrame {

    AnimationPanel panel;

    AnimationFrame(){

        panel = new AnimationPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
