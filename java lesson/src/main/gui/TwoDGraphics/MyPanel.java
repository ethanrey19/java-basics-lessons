package main.gui.TwoDGraphics;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    Image image;

    MyPanel(){
        image = new ImageIcon("X.png").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g; // makes the graphics 2d

        graphics2D.setPaint(Color.blue); // color of line
        graphics2D.setStroke(new BasicStroke(5)); // thickness of line
        graphics2D.drawLine(0,0,500,500);

        graphics2D.setPaint(Color.PINK);
        graphics2D.drawRect(0,0,100,200); // outline of a rectangle
        graphics2D.fillRect(0,0,100,200); // filled rectangle

        graphics2D.setPaint(Color.ORANGE);
        graphics2D.drawOval(0,0,100,100); // outline of an Oval
        graphics2D.fillOval(0,0,100,100); // filled oval

        graphics2D.setPaint(Color.RED);
        graphics2D.drawArc(0,0,100,100,180,180);
        graphics2D.fillArc(0,0,100,100,0,180);
        graphics2D.setPaint(Color.WHITE);
        graphics2D.fillArc(0,0,100,100,180,180);

        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        graphics2D.setPaint(Color.YELLOW);
        graphics2D.drawPolygon(xPoints,yPoints,3); // needs array of integers
        graphics2D.fillPolygon(xPoints,yPoints,3);

        graphics2D.setPaint(Color.MAGENTA);
        graphics2D.setFont(new Font("Ink Free",Font.BOLD,40));
        graphics2D.drawString("THIS IS A STRING",50,50); // draws a String

        graphics2D.drawImage(image,0,0,null);

    }
}
