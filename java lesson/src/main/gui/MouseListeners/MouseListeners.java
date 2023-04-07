package main.gui.MouseListeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListeners extends JFrame implements MouseListener {

    JLabel label;

    MouseListeners(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been clicked (pressed and released) on a component

        //System.out.println("You clicked the mouse!");
        label.setBackground(Color.RED);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Invoked when a mouse button has been pressed on a component

        //System.out.println("You pressed the mouse!");
        label.setBackground(Color.YELLOW);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component

        //System.out.println("You released the mouse!");
        label.setBackground(Color.GREEN);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Invoked when the mouse enters a component

        //System.out.println("You entered the component!");
        label.setBackground(Color.BLUE);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Invoked when the mouse exists a component

        //System.out.println("You existed the component!");
        label.setBackground(Color.RED);

    }
}
