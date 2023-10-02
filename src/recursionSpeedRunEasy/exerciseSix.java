package recursionSpeedRunEasy;

import javakara.JavaKaraProgram;

public class exerciseSix extends JavaKaraProgram {

    public static void main(String[] args) {
        new exerciseSix().run("E:\\kms.world");
    }

    public void myMainProgram() {
        this.exerciseSix();
    }

    void exerciseSix() {
        if (kara.treeFront()) {
            if (kara.treeRight() && !kara.treeLeft()) {
                kara.turnLeft();
                this.exerciseSix();
                kara.turnRight();
            } else if (kara.treeLeft() && !kara.treeRight()) {
                kara.turnRight();
                this.exerciseSix();
                kara.turnLeft();
            }
        } else if (!(kara.treeRight() || kara.treeLeft())) {
            kara.turnLeft();
            kara.turnLeft();
        } else {
            kara.move();
            this.exerciseSix();
            kara.move();
        }
    }
}
