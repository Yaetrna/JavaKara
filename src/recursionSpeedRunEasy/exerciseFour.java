package recursionSpeedRunEasy;

import javakara.JavaKaraProgram;

public class exerciseFour extends JavaKaraProgram {

    public static void main(String[] args) {
        new exerciseFour().run();
    }

    public void myMainProgram() {
        world.setSize(21, 2);
        world.setTree(10, 1, true);
        kara.setPosition(0, 1);
        for (int i = 0; i < 10; i++) {
            int x = tools.random(9);
            world.setLeaf(x, 1, true);
        }
        tools.sleep(2500);
        this.exerciseFour();
    }

    void exerciseFour() {
        if (kara.treeFront()) {
            if (kara.onLeaf()) {
                kara.removeLeaf();
                this.bypassTree();
                kara.putLeaf();
            } else {
                this.bypassTree();
            }
        } else {
            if (kara.onLeaf()) {
                kara.removeLeaf();
                kara.move();
                this.exerciseFour();
                kara.move();
                kara.putLeaf();
            } else {
                kara.move();
                this.exerciseFour();
                kara.move();
            }
        }
    }

    void bypassTree() {
        kara.turnLeft();
        kara.move();
        kara.turnRight();
        kara.move();
        kara.move();
        kara.turnRight();
        kara.move();
        kara.turnLeft();
    }
}
