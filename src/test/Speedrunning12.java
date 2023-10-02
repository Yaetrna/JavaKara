package test;

import javakara.JavaKaraProgram;

public class Speedrunning12 extends JavaKaraProgram {

    public static void main(String[] args) {
        new Speedrunning12().run();
    }

    public void myMainProgram() {
        world.setSize(10, 100);
        kara.setPosition(0, 99);
        this.putLeaves(world.getSizeY());
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
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
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
        for (int x = 1; x < y; x++) {
            kara.turnLeft();
            if (fibonacci(x) < (world.getSizeY() + world.getSizeX()) / 2) {
                for (int detour = 0; detour < fibonacci(x); detour++) {
                    kara.putLeaf();
                    kara.move();
                }
                if (kara.onLeaf()) {
                    kara.move();
                } else {
                    kara.move();
                    this.turnAround();
                    kara.move();
                    kara.turnLeft();
                    kara.move();
                }
            } else {
                return;
            }
        }
    }
}
