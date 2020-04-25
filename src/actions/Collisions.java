package actions;

import gamelogic.Snake;

public class Collisions {

    public static boolean collideBorder() {

        //start own code
        return Snake.head.getX() < 0 || Snake.head.getX() > 15 || Snake.head.getY() < 0 || Snake.head.getY() > 15;
        //end own code
    }
    
    public static void collideApple() {

        //start own code
        if (Snake.head.getX() == Snake.apple.getX() && Snake.head.getY() == Snake.apple.getY()) {
            Snake.apple.reset();
            Snake.addTail();
            //TODO add score
        }
        //end own code
    }

    public static boolean collideSelf() {
        //start own code
        for (int i = 0; i < Snake.tails.size(); i++ ) {
            if(Snake.tails.get(i).getX() == Snake.head.getX() && Snake.tails.get(i).getY() == Snake.head.getY()
                    && !Snake.tails.get(i).isWait()) {
                return true;
            }
        }
        return false;
        //end own code
    }
}
