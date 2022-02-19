package Minekroft.Graphics;

import java.util.Random;

public class Screen extends Render {

    public Render test;

    public Screen(int width, int height) {
        super(width, height);
        Random random = new Random();
        test = new Render(256,256);
        for (int i = 0; i < 256*256; i++) {
            test.pixels[i] = random.nextInt();
        }
    }

    public void render() {
        int anim = (int) (Math.sin(System.currentTimeMillis() / 1000.0 * Math.PI * 2) * 100);
        int anim2 = (int) (Math.cos(System.currentTimeMillis() / 1000.0 * Math.PI * 2) * 100);
        System.out.println(anim);
        draw(test,((width - 256) / 2) + anim, ((height - 256) / 2) + anim2);
        System.out.println("running");
    }
}
