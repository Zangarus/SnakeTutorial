package gamelogic;

import java.util.concurrent.ThreadLocalRandom;

public class Apple {

    private int x;
    private int y;

    public Apple() {
        reset();
    }

    public void reset(){
        this.x = ThreadLocalRandom.current().nextInt(0, 15);
        this.y = ThreadLocalRandom.current().nextInt(0,15);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
