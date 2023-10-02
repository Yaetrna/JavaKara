package recursionSpeedRunEasy;

import javakara.JavaKaraProgram;

import java.util.IllegalFormatCodePointException;

public class exerciseFive extends JavaKaraProgram {

    public static void main(String[] args) {
        new exerciseFive().run("E:\\kys.world");
    }

    public void myMainProgram() {
        this.exerciseFive();
    }

    void exerciseFive() {
        if (kara.mushroomFront()) {
            if (kara.onLeaf()) {
                kara.removeLeaf();
                this.turnAround();
                kara.putLeaf();
            } else {
                this.turnAround();
            }
        } else {
            if (kara.onLeaf()) {
                kara.removeLeaf();
                kara.move();
                this.exerciseFive();
                kara.move();
                kara.putLeaf();
            } else {
                this.turnAround();
                kara.move();
                kara.turnLeft();
                kara.move();
                this.exerciseFive();
                kara.move();
                kara.turnRight();
                kara.move();
                this.turnAround();
            }
        }
    }

    void turnAround() {
        kara.turnLeft();
        kara.turnLeft();
    }
}
