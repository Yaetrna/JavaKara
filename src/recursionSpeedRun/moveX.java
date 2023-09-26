package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class moveX extends JavaKaraProgram {

    public static void main(String[] args) {
        new moveX().run();
    }

    public void myMainProgram() {
        this.moveX(10);
    }

    void moveX(int n) {
        if (n > 0) {
            kara.move();
            this.moveX(n - 1);
        }
    }
}
