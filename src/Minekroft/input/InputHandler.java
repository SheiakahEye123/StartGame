package Minekroft.input;

import java.awt.event.*;

public class InputHandler implements KeyListener, FocusListener, MouseListener, MouseMotionListener {

    public boolean[] key = new boolean[68836];

    public void focusGained(FocusEvent e) {

    }


    public void focusLost(FocusEvent e) {

    }


    public void keyTyped(KeyEvent e) {

    }


    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode > 0 && keyCode < key.length) {
            key[keyCode] = true;
            System.out.println("mogus");
        }
    }

    public void keyReleased (KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode > 0 && keyCode < key.length) {
            key[keyCode] = false;
            System.out.println("sosus");
        }
    }

    @Override
    public void mouseClicked (MouseEvent e){

    }

    @Override
    public void mousePressed (MouseEvent e){

    }

     @Override
     public void mouseReleased (MouseEvent e){

     }

     @Override
     public void mouseEntered (MouseEvent e){

     }

     @Override
     public void mouseExited (MouseEvent e){

     }

     @Override
     public void mouseDragged (MouseEvent e){

     }

     @Override
     public void mouseMoved (MouseEvent e){

        }
    }
