package recursionSpeedRunEasy;

import javakara.JavaKaraProgram;

public class exerciseEight extends JavaKaraProgram {

    public static void main(String[] args) {
        new exerciseEight().run("E:\\ret.world");
    }

    public void myMainProgram() {
        this.exerciseEight();
    }

    void exerciseEight() {
        if (kara.treeFront()) {
            this.climbUp();
            this.exerciseEight();
            this.climbDown();
        } else {
            kara.move();
            if (kara.treeRight()) {
                this.exerciseEight();
            }
        }
    }

    void climbUp() {
        kara.turnLeft();
        kara.move();
        kara.turnRight();
        kara.move();
        kara.move();
    }

    void climbDown() {
        kara.turnRight();
        kara.move();
        kara.turnLeft();
        kara.move();
        kara.move();
    }
}
