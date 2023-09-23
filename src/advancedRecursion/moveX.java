package advancedRecursion;

import javakara.JavaKaraProgram;

public class moveX extends JavaKaraProgram {

    public static void main(String[] args) {
        new moveX().run();
    }

    public void myMainProgram() {
        kara.setPosition(0, 0);
        this.start(10);
    }

    int start(int n) {
        if (n < 1) {
            return 0;
        } else {
            kara.move();
            return start(n - 1);
        }
    }
}
