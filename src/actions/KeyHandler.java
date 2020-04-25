package actions;

import gamelogic.Direction;
import gamelogic.Snake;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()){
            case KeyEvent.VK_UP:
                if(!Snake.waitToMove && Snake.head.getDir()!=Direction.DOWN){
                    Snake.head.setDir(Direction.UP);
                    Snake.waitToMove = true;
                }
                break;

                //start own code
            case KeyEvent.VK_RIGHT:
                if(!Snake.waitToMove && Snake.head.getDir()!=Direction.LEFT){
                    Snake.head.setDir(Direction.RIGHT);
                    Snake.waitToMove = true;
                }
                    break;
            case KeyEvent.VK_LEFT:
                if(!Snake.waitToMove && Snake.head.getDir()!=Direction.RIGHT){
                    Snake.head.setDir(Direction.LEFT);
                    Snake.waitToMove = true;
                }
                break;
            case KeyEvent.VK_DOWN:
                if(!Snake.waitToMove && Snake.head.getDir()!=Direction.UP){
                    Snake.head.setDir(Direction.DOWN);
                    Snake.waitToMove = true;
                }
                break;
                //end own code
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
