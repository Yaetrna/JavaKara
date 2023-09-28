package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class moveX extends JavaKaraProgram {

    public static void main(String[] args) {
        new moveX().run();
    }

    public void myMainProgram() {
        kara.setPosition(0, 0);
        world.setSize(25, 1);
        tools.sleep(5000);
        this.moveX(25);
    }

    void moveX(int n) {
        if (n > 0) {
            kara.move();
            this.moveX(n - 1);
        }
    }
}
