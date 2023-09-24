package advancedRecursion;

import javakara.JavaKaraProgram;

public class fibonacciSpiral extends JavaKaraProgram {
    public static void main(String[] args) {
        new fibonacciSpiral().run();
    }

    public void myMainProgram() {
        world.setSize(80, 80);
        kara.setPosition(40, 40);
        this.start(1, true);
    }

    void start(int n, boolean leaf) {
        int fibo = this.fibonacci(n);
        if (n > 10) {
                kara.turnLeft();
                kara.turnLeft();
        } else {
            if (leaf) {
                this.putX(fibo);
            } else {
                this.moveX(fibo);
            }
            kara.turnLeft();
            this.start(n + 1, leaf);
            kara.turnRight();
            this.moveX(fibo);
        }
    }

    int fibonacci(int n) {
        if (n > 2) {
            return this.fibonacci(n - 1) + this.fibonacci(n - 2);
        } else if (n > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    void moveX(int n) {
        if (n > 0) {
            kara.move();
            this.moveX(n - 1);
        }
    }

    void putX(int n) {
        if (n > 0) {
            kara.putLeaf();
            kara.move();
            this.putX(n - 1);
        }
    }
}
