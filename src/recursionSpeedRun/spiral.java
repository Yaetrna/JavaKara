package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class spiral extends JavaKaraProgram {

    public static void main(String[] args) {
        new spiral().run();
    }

    public void myMainProgram() {
        world.setSize(25, 25);
        kara.setPosition(12, 12);
        tools.sleep(2000);
        this.spiral(1);
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

    void spiral(int n) {
        for (int i = 0; i < 10; i++) {
            this.frontX(i, true);
            kara.turnLeft();
        }
        /*kara.turnLeft();
        for (int i = 9; i > 0; i--) {
            this.frontX(i, false);
            kara.turnRight();
        }*/
    }
}
