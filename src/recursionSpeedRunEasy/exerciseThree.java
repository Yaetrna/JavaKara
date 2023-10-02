package recursionSpeedRunEasy;

import javakara.JavaKaraProgram;

public class exerciseThree extends JavaKaraProgram {

    public static void main(String[] args) {
        new exerciseThree().run();
    }

    public void myMainProgram() {
        world.setSize(10, 1);
        world.setTree(9, 0, true);
        kara.setPosition(0, 0);
        for (int i = 0; i < 9; i++) {
            int x = tools.random(8);
            world.setLeaf(i, 0, true);
        }
        this.exerciseThree();
    }

    // Harder than it looks.

    void exerciseThree() {
        if (kara.onLeaf()) {
            kara.removeLeaf();
            this.exerciseThree();
            kara.putLeaf();
        } else if (!kara.treeFront()) {
            kara.move();
            this.exerciseThree();
            kara.move();
        } else {
            kara.turnLeft();
            kara.turnLeft();
        }
    }
}
