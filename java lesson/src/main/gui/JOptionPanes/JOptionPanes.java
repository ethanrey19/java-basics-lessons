package main.gui.JOptionPanes;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;

public class JOptionPanes {
    public static void main(String[] args) {

        // JOptionPane = a pop-up standard dialog box that prompts users for value,
        //               or informs them of something.

        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info", "title",JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"This is some useless info?", "title",JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Your Computer has a Virus", "Virus!",JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"There is an error!", "title",JOptionPane.ERROR_MESSAGE);

        //int answer = JOptionPane.showConfirmDialog(null,"Yes or No?","Title",JOptionPane.YES_NO_CANCEL_OPTION);
        //System.out.println(answer);
        //String name = JOptionPane.showInputDialog("What is your name? : ");
        //System.out.println("Hello " + name);

        String[] responses = {"Thank you","Yes!","No!"};

        ImageIcon icon = new ImageIcon("logo.png");

        JOptionPane.showOptionDialog(null,"Hello!","secret message", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,responses,0);

    }
}
