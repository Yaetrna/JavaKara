package recursionSpeedRunEasy;

import javakara.JavaKaraProgram;

public class exerciseTwo extends JavaKaraProgram {

    public static void main(String[] args) {
        new exerciseTwo().run();
    }

    public void myMainProgram() {
        world.setSize(10, 1);
        kara.setPosition(0, 0);
        world.setLeaf(9, 0, true);
        this.exerciseTwo();
        kara.putLeaf();
    }

    void exerciseTwo() {
        if (kara.onLeaf()) {
            kara.removeLeaf();
            kara.turnLeft();
            kara.turnLeft();
        } else {
            kara.move();
            this.exerciseTwo();
            kara.move();
        }
    }
}
