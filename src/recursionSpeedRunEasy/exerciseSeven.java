package recursionSpeedRunEasy;

import javakara.JavaKaraProgram;

public class exerciseSeven extends JavaKaraProgram {

    public static void main(String[] args) {
        new exerciseSeven().run("E:\\ret.world");
    }

    public void myMainProgram() {
        this.exerciseSeven();
    }

    void exerciseSeven() {
        if (kara.treeFront()) {
            this.climbUp();
            this.exerciseSeven();
        } else {
            kara.move();
            if (!kara.treeRight()) {
                kara.turnLeft();
                kara.turnLeft();
                kara.move();
                kara.turnLeft();
                kara.turnLeft();
            } else {
                this.exerciseSeven();
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
}
