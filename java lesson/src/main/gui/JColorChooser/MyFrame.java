package main.gui.JColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("This is some text");
        label.setFont(new Font("MV Boli",Font.BOLD,100));
        label.setOpaque(true);

        this.add(label);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button){

            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"Pick a Color", Color.BLACK);

            //label.setForeground(color);
            label.setBackground(color);
        }

    }
}
