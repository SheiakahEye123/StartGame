package Minekroft;

import Minekroft.input.Controller;

import java.awt.event.KeyEvent;

public class Game {
    public int time;
    public Controller controls;

    public Game() {
        controls = new Controller();
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

        controls.tick(forward, back, left, right, turnLeft, turnRight);

    }
}
