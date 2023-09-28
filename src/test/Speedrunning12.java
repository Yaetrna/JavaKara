package test;

import javakara.JavaKaraProgram;

/**
 *

 description*
 @version 1.0 from 27.09.2023
 @author
 */

public class Speedrunning12 extends JavaKaraProgram {

    public static void main(String[] args) {
        new Speedrunning12().run();
    }

    public void myMainProgram() {
        world.setSize(100, 100);
        kara.setPosition(0, 99);
        int worldSizeY = world.getSizeY();
        this.putLeaves(worldSizeY);
    }

    void turnAround() {
        kara.turnRight();
        kara.turnRight();
    }

    int fibonacci(int n) {
        /*
        if (n < 1) {
            return 0;
        } else if (n < 2) {
            return 1;
        }
        Would be slightly better as it does not violate the DRY principle.
        DRY = Do Not Repeat yourself.
        */
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    void putLeaves(int y) {
        for (int longer = 1; longer < y; longer++) {
            kara.turnLeft();
            if (fibonacci(longer) <= 100) {
                for (int detour = 0; detour<= fibonacci(longer); detour++) {
                    kara.putLeaf();
                    if(!kara.treeFront()) {
                        kara.move();
                    } else {
                        this.turnAround();
                        break;
                    }
                }
                this.turnAround();
                while (kara.onLeaf()) {
                    kara.move();
                }
                this.turnAround();
                kara.move();
                kara.turnRight();
                kara.move();
            }
        }
    }
}
