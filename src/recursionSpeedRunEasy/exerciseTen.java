package recursionSpeedRunEasy;

import javakara.JavaKaraProgram;

public class exerciseTen extends JavaKaraProgram {

    public static void main(String[] args) {
        new exerciseTen().run("E:\\maz.world");
    }

    public void myMainProgram() {
        this.getToWall();
    }

    void exerciseTen() {
        if (kara.onLeaf()) {
            kara.turnLeft();
            kara.turnLeft();
        } else {
            // Very slow code because of over 9000 if-statements.
            if (kara.treeFront()) {
                if (kara.treeLeft() && !kara.treeRight()) {
                    kara.turnRight();
                    kara.move();
                    this.exerciseTen();
                    kara.move();
                    kara.turnLeft();
                } else if (kara.treeRight() && !kara.treeLeft()) {
                    kara.turnLeft();
                    kara.move();
                    this.exerciseTen();
                    kara.move();
                    kara.turnRight();
                } else if (!kara.treeRight() && !kara.treeLeft()) {
                    kara.turnRight();
                    kara.move();
                    this.exerciseTen();
                    kara.move();
                    kara.turnLeft();
                } else {
                    kara.turnLeft();
                    kara.turnLeft();
                    this.exerciseTen();
                    kara.turnLeft();
                    kara.turnLeft();
                }
            } else {
                if (!kara.treeRight()) {
                    kara.turnRight();
                    kara.move();
                    this.exerciseTen();
                    kara.move();
                    kara.turnLeft();
                } else {
                    kara.move();
                    this.exerciseTen();
                    kara.move();
                }
            }
        }
    }

    void getToWall() {
        if (kara.treeFront()) {
            kara.turnLeft();
            this.exerciseTen();
            kara.turnRight();
        } else {
            kara.move();
            this.getToWall();
            kara.move();
        }
    }
}
