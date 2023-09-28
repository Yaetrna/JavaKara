package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class spiral extends JavaKaraProgram {

    public static void main(String[] args) {
        new spiral().run();
    }

    public void myMainProgram() {
        world.setSize(25, 25);
        kara.setPosition(12, 12);
        tools.sleep(5000);
        this.spiral();
    }

    void frontX(int n, boolean leaf) {
        if (n > 0) {
            if (leaf) {
                kara.putLeaf();
            }
            kara.move();
            this.frontX(n - 1, leaf);
        }
    }

    void spiral() {
        for (int i = 0; i < 26; i++) {
            this.frontX(i, true);
            kara.turnLeft();
        }
    }
}
