package gui;


import actions.KeyHandler;

import javax.swing.*;

public class Gui {
    JFrame jf;
    Draw d;
    public static int height = 800;
    public static int width = 800;
    public static int xoff =130;
    public static int yoff = 20;


    /**
     * Creates the game field
     */
    public void createField(){
        jf = new JFrame("Snake");
        jf.setSize(width, height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLocationRelativeTo(null);
        jf.setLayout(null);
        jf.setResizable(false);

        jf.addKeyListener(new KeyHandler()); //hint use keyhandler from actions

        d = new Draw();
        d.setBounds(0,0, width, height);
        d.setVisible(true);
        jf.add(d);

        jf.requestFocus();
        jf.setVisible(true);



    }
}
