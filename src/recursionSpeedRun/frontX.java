package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class frontX extends JavaKaraProgram {

    public static void main(String[] args) {
        new frontX().run();
    }

    public void myMainProgram() {
        this.frontX(10, true);
    }

    void frontX(int n, boolean leaf) {
        if (n > 0) {
            if (leaf) {
                kara.putLeaf();
            }
            kara.move();
            this.frontX(n - 1, leaf);
        }
    }
}
