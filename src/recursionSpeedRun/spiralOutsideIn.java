package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class spiralOutsideIn extends JavaKaraProgram {

    public static void main(String[] args) {
        new spiralOutsideIn().run();
    }

    public void myMainProgram() {
        world.setSize(25, 25);
        kara.setPosition(0, 0);
        this.spiral(12);
    }

    void turnAround() {
        kara.turnLeft();
        kara.turnLeft();
    }

    void frontX(int n, boolean leaf) {
        if (n > 0) {
            // Check is here so that the program works with leaf == false
            if (leaf) {
                kara.putLeaf();
            }
            kara.move();
            this.frontX(n - 1, leaf);
        }
    }

    void spiral(int n) {
        if (n > 0) {
            this.frontX(n, true);
            this.turnAround();
            kara.move();
            kara.turnLeft();
            kara.move();
            this.spiral(n - 1);
            kara.turnLeft();
            this.frontX(n, false);
        } else {
            this.turnAround();
            kara.move();
        }
    }
}
