package recursionSpeedRunEasy;

import javakara.JavaKaraProgram;

public class exerciseNine extends JavaKaraProgram {

    public static void main(String[] args) {
        new exerciseNine().run("E:\\run.world");
    }

    public void myMainProgram() {
        this.exerciseNine();
        kara.putLeaf();
    }

    void exerciseNine() {
        if (kara.onLeaf()) {
            kara.removeLeaf();
            kara.turnLeft();
            kara.turnLeft();
        } else {
            if (kara.treeRight()) {
                kara.move();
                this.exerciseNine();
                kara.move();
            } else {
                kara.turnRight();
                kara.move();
                this.exerciseNine();
                kara.move();
                kara.turnLeft();
            }
        }
    }
}
