package advancedRecursion;

import javakara.JavaKaraProgram;

public class spiral extends JavaKaraProgram {

    public static void main(String[] args) {}

    public void myMainProgram() {
        world.setSize(50, 50);
        kara.setPosition(25, 25);
        this.start(1, true);
    }

    void start(int n, boolean leaf) {
        if (n > 25) {
            kara.turnLeft();
            kara.turnLeft();
        } else {
            if (leaf) {
                this.putX(n);
            } else {
                this.moveX(n);
            }
            kara.turnLeft();
            this.start(n + 1, leaf);
            kara.turnRight();
            this.moveX(n);
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

    int putX(int n) {
        if (n < 1) {
            return 0;
        } else {
            kara.putLeaf();
            kara.move();
            return this.putX(n - 1);
        }
    }
}
