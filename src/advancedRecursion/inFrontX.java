package advancedRecursion;

import javakara.JavaKaraProgram;

public class inFrontX extends JavaKaraProgram {

    public static void main(String[] args) {
        new inFrontX().run();
    }

    public void myMainProgram() {
        kara.setPosition(0, 0);
        this.start(10, true);
    }

    int start(int n, boolean leaf) {
        if (n < 1) {
            return 0;
        } else {
            if (leaf) {
                kara.putLeaf();
            }
            kara.move();
            return start(n - 1, leaf);
        }
    }
}
