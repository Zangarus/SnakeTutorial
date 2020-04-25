package gui;

import gamelogic.Apple;
import gamelogic.Snake;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {

    Point p;
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        //background
        g.setColor(Color.lightGray);
        g.fillRect(0,0, Gui.width, Gui.height); // TODO requires precise explanation

        //start own code
        //tail
        g.setColor(new Color(51,204,51));
        for(int i =0; i< Snake.tails.size();i++){
            p = Snake.positionToCoordinate(Snake.tails.get(i).getX(),Snake.tails.get(i).getY());
            g.fillOval(p.x,p.y,32,32);
        }

        //head
        g.setColor(new Color(0,153,0));
        p = Snake.positionToCoordinate(Snake.head.getX(), Snake.head.getY());
        g.fillOval(p.x,p.y,32,32);
        //end own code

        //grid
        g.setColor(Color.gray);
        for(int i=0; i<16; i++){
            //start own code
            for(int j=0; j<16; j++){
                g.drawRect(i*32+Gui.xoff, j*32+Gui.yoff,32,32);
            }
            //end own code
        }

        //border
        //start own code
        g.setColor(Color.black);
        g.drawRect(Gui.xoff, Gui.yoff, 512, 512);
        //end own code

        //start own code
        //apple
        g.setColor(new Color(204,51,0));
        p = Snake.positionToCoordinate(Snake.apple.getX(), Snake.apple.getY());
        g.fillOval(p.x, p.y, 32, 32);
        //end own code

        repaint();
    }
}
