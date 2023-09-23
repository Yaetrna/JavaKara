package advancedRecursion;

import javakara.JavaKaraProgram;

public class fibonacciPlacer extends JavaKaraProgram {

    public static void main(String[] args) {
        new fibonacciPlacer().run();
    }

    public void myMainProgram() {
        kara.setPosition(0, 0);
        world.setSize(1000, 16);
        tools.sleep(15000);
        this.start();
    }

    void start() {
        for (int i = 1; i <= 16; i++) {
            int x = this.fibonacci(i);
            System.out.println(x);
            this.putX(x);
            kara.turnRight();
            kara.move();
            kara.turnRight();
            this.moveX(x);
            kara.turnLeft();
            kara.turnLeft();
        }
    }

    int fibonacci(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 3) {
            return 1;
        } else {
            return this.fibonacci(n - 1) + this.fibonacci(n - 2);
        }
    }

    int putX(int n) {
        if (n < 1) {
            return 0;
        } else {
            kara.putLeaf();
            kara.move();
            return this.putX(n - 1);
        }
    }

    int moveX(int n) {
        if (n < 1) {
            return 0;
        } else {
            kara.move();
            return this.moveX(n - 1);
        }
    }
}
