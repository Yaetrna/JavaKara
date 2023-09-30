package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class spiralInsideOut extends JavaKaraProgram {

    public static void main(String[] args) {
        new spiralInsideOut().run();
    }

    public void myMainProgram() {
        world.setSize(100, 100);
        kara.setPosition(50, 50);
        this.spiralInsideOut(1, 50);
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

    void spiralInsideOut(int min, int max) {
        if (min < max) {
            this.frontX(min, true);
            kara.turnLeft();
            this.spiralInsideOut(min + 1, max);
            this.frontX(min, false);
            kara.turnRight();
        } else {
            kara.turnLeft();
        }
    }
}
