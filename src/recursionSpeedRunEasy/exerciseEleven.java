package recursionSpeedRunEasy;

import javakara.JavaKaraProgram;

public class exerciseEleven extends JavaKaraProgram {

    public static void main(String[] args) {
        new exerciseEleven().run("E:\\exe.run");
    }

    public void myMainProgram() {
        this.exerciseEleven(true);
    }

    void exerciseEleven(boolean left) {
        if (kara.mushroomFront()) {
            kara.move();
            this.turnAroundAndMove();
            this.exerciseEleven(left);
        } else {
            if (kara.onLeaf()) {
                kara.move();
                this.exerciseEleven(left);
            } else {
                this.turnAroundAndMove();
                if (left) {
                    kara.turnLeft();
                    kara.move();
                    this.exerciseEleven(false);
                    kara.turnRight();
                } else {
                    kara.turnRight();
                    kara.move();
                    this.exerciseEleven(true);
                    kara.turnLeft();
                }
            }
        }
    }

    void turnAroundAndMove() {
        kara.turnLeft();
        kara.turnLeft();
        kara.move();
    }
}
