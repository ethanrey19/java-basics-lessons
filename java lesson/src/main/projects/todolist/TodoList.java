package main.projects.todolist;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoList extends JFrame implements ActionListener {

    JPanel topPanel;
    JPanel bottomPanel;
    ImageIcon xIcon;
    ImageIcon checkIcon;
    JButton button;
    JCheckBox onecheckBox;
    JCheckBox twocheckBox;
    JCheckBox threecheckBox;
    JCheckBox fourcheckBox;
    JTextField onetextField;
    JTextField twotextField;
    JTextField threetextField;
    JTextField fourtextField;
    JLabel titleLabel;

    TodoList(){

        titleLabel = new JLabel("To-Do List");
        titleLabel.setFont(new Font("Tilt Warp",Font.BOLD,35));

        xIcon = new ImageIcon("X.png");
        checkIcon = new ImageIcon("checkmark.png");

        onetextField = new JTextField();
        onetextField.setText("");
        onetextField.setFont(new Font("Roboto",Font.PLAIN,25));
        onetextField.setLayout(null);
        onetextField.setBounds(60,5,300,50);

        twotextField = new JTextField();
        twotextField.setText("");
        twotextField.setFont(new Font("Roboto",Font.PLAIN,25));
        twotextField.setLayout(null);
        twotextField.setBounds(60,75,300,50);

        threetextField = new JTextField();
        threetextField.setText("");
        threetextField.setFont(new Font("Roboto",Font.PLAIN,25));
        threetextField.setLayout(null);
        threetextField.setBounds(60,145,300,50);

        fourtextField = new JTextField();
        fourtextField.setText("");
        fourtextField.setFont(new Font("Roboto",Font.PLAIN,25));
        fourtextField.setLayout(null);
        fourtextField.setBounds(60,215,300,50);

        onecheckBox = new JCheckBox();
        onecheckBox.setIcon(xIcon);
        onecheckBox.setSelectedIcon(checkIcon);
        onecheckBox.setLayout(null);
        onecheckBox.setBounds(5,5,50,50);
        onecheckBox.setFocusable(false);

        twocheckBox = new JCheckBox();
        twocheckBox.setIcon(xIcon);
        twocheckBox.setSelectedIcon(checkIcon);
        twocheckBox.setLayout(null);
        twocheckBox.setBounds(5,75,50,50);
        twocheckBox.setFocusable(false);

        threecheckBox = new JCheckBox();
        threecheckBox.setIcon(xIcon);
        threecheckBox.setSelectedIcon(checkIcon);
        threecheckBox.setLayout(null);
        threecheckBox.setBounds(5,145,50,50);
        threecheckBox.setFocusable(false);

        fourcheckBox = new JCheckBox();
        fourcheckBox.setIcon(xIcon);
        fourcheckBox.setSelectedIcon(checkIcon);
        fourcheckBox.setLayout(null);
        fourcheckBox.setBounds(5,215,50,50);
        fourcheckBox.setFocusable(false);

        button = new JButton();
        button.setBorder(null);
        button.setBounds(5,5,50,50);
        button.setFocusable(false);

        topPanel = new JPanel(new FlowLayout());
        topPanel.setBounds(45,50,400,50);
        topPanel.add(titleLabel);
        topPanel.setVisible(true);

        bottomPanel = new JPanel();
        bottomPanel.setBounds(45,125,400,400);
        bottomPanel.setLayout(null);
        bottomPanel.add(onecheckBox);
        bottomPanel.add(twocheckBox);
        bottomPanel.add(threecheckBox);
        bottomPanel.add(fourcheckBox);
        bottomPanel.add(onetextField);
        bottomPanel.add(twotextField);
        bottomPanel.add(threetextField);
        bottomPanel.add(fourtextField);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,650);
        this.setResizable(false);

        this.add(topPanel);
        this.add(bottomPanel);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
