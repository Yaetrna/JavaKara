package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class frontX extends JavaKaraProgram {

    public static void main(String[] args) {
        new frontX().run();
    }

    public void myMainProgram() {
        kara.setPosition(0, 0);
        world.setSize(25, 1);
        tools.sleep(5000);
        this.frontX(25, true);
    }

    void frontX(int n, boolean leaf) {
        if (n > 0) {
            // Check is here so that the program works with leaf == false
            if (leaf) {
                kara.putLeaf();
            }
            kara.move();
            this.frontX(n - 1, leaf);
        }
    }
}
