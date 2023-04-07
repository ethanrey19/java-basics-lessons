package main.gui.TwoDAnimation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    AnimationPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        enemy = new ImageIcon("C:\\Users\\Ebud\\OneDrive\\Desktop\\java code\\java lesson\\src\\main\\gui\\TwoDAnimation\\enemy.png").getImage();
        backgroundImage = new ImageIcon("C:\\Users\\Ebud\\OneDrive\\Desktop\\java code\\java lesson\\src\\main\\gui\\TwoDAnimation\\background.png").getImage();
        timer = new Timer(10,this);
        timer.start();
    }

    public void paint(Graphics g){

        super.paint(g); // paints background

        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.drawImage(backgroundImage,0,0,null);
        graphics2D.drawImage(enemy,x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(x >= PANEL_WIDTH-enemy.getWidth(null) || x < 0){
            xVelocity = xVelocity * -1;
        }
          x = x + xVelocity;

        if(x >= PANEL_HEIGHT-enemy.getHeight(null) || y < 0){
            yVelocity = yVelocity * -1;
        }

        y = y + yVelocity;
        repaint();
    }
}
