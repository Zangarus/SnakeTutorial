package gui;

import gamelogic.Snake;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;

public class Draw extends JLabel {

    public static int fieldSize = 32;
    public static int gameSize = 512;

    @Override
    protected void paintComponent(Graphics g)  {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        //background
        g.setColor(Color.lightGray);
        g.fillRect(0,0, Gui.width, Gui.height); // TODO requires precise explanation

        //start own code
        //tail
        g.setColor(new Color(51,204,51));
        Point p;
        for (int i = 0; i < Snake.tails.size(); i++){
            p = Snake.positionToCoordinate(Snake.tails.get(i).getX(),Snake.tails.get(i).getY());
            g.fillOval(p.x, p.y, fieldSize, fieldSize);
        }

        //head
        g.setColor(new Color(0,153,0));
        p = Snake.positionToCoordinate(Snake.head.getX(), Snake.head.getY());
        g.fillOval(p.x, p.y, fieldSize, fieldSize);
        //end own code

        //grid
        g.setColor(Color.gray);
        for (int i = 0; i < gameSize / fieldSize; i++) {
            //start own code
            for (int j = 0; j < gameSize / fieldSize; j++)  {
                g.drawRect(i * fieldSize + Gui.xoff, j * fieldSize + Gui.yoff, fieldSize, fieldSize);
            }
            //end own code
        }

        //border
        //start own code
        g.setColor(Color.black);
        g.drawRect(Gui.xoff, Gui.yoff, gameSize, gameSize);
        //end own code

        //start own code
        //apple
        g.setColor(new Color(204,51,0));
        p = Snake.positionToCoordinate(Snake.apple.getX(), Snake.apple.getY());
        g.fillOval(p.x, p.y, fieldSize, fieldSize);
        //end own code

        repaint();
    }
}
