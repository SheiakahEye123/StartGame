package Minekroft;

import java.awt.event.KeyEvent;

public class Game {
    public int time;

    public Game() {

    }

    public void tick(boolean[] key) {
        time++;
        boolean forward = key[KeyEvent.VK_W];
        boolean left = key[KeyEvent.VK_A];
        boolean back = key[KeyEvent.VK_S];
        boolean right = key[KeyEvent.VK_D];
        boolean shift = key[KeyEvent.VK_SHIFT];
        boolean jump = key[KeyEvent.VK_SPACE];
        boolean turnLeft = key[KeyEvent.VK_LEFT];
        boolean turnRight = key[KeyEvent.VK_RIGHT];

    }
}
