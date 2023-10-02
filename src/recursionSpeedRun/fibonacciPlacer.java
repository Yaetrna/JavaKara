package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class fibonacciPlacer extends JavaKaraProgram {

    public static void main(String[] args) {
        new fibonacciPlacer().run();
    }

    public void myMainProgram() {
        world.setSize(1000, 16);
        kara.setPosition(0, 0);
        this.fibonacciPlacer(1);
    }

    int fibonacci(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 2) {
            return 1;
        } else {
            return this.fibonacci(n - 1) + this.fibonacci(n - 2);
        }
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

    void moveX(int n) {
        if (n > 0) {
            kara.move();
            this.moveX(n - 1);
        }
    }

    void fibonacciPlacer(int n) {
        if (n < 17) {
            int x = this.fibonacci(n);
            this.frontX(x / 2, true);
            kara.turnLeft();
            kara.turnLeft();
            this.moveX(x);
            kara.turnLeft();
            kara.move();
            kara.turnLeft();
            this.fibonacciPlacer(n + 1);
        }
    }
}
