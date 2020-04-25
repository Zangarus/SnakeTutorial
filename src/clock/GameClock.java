package clock;

import actions.Collisions;
import gamelogic.Snake;

public class GameClock extends Thread {
    public boolean running = true;

    public void run() {
        while(running) {
            try {
                sleep(500);
                Snake.move();
                Collisions.collideApple();
                if(Collisions.collideBorder() || Collisions.collideSelf()) {
                    Snake.tails.clear();
                    Snake.head.setX(7);
                    Snake.head.setY(7);
                }
                Snake.waitToMove = false;
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
