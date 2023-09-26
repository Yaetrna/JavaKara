package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class fibonacciSpiral extends JavaKaraProgram {

    public static void main(String[] args) {
        new fibonacciSpiral().run();
    }

    public void myMainProgram() {
        world.setSize(100, 100);
        kara.setPosition(50, 50);
        this.fibonacciSpiral();
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

    void fibonacciSpiral() {
        for (int i = 1; i < 10; i++) {
            int x = this.fibonacci(i);
            this.frontX(x, true);
            kara.turnLeft();
        }
    }
}
