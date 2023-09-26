package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class power extends JavaKaraProgram {

    public static void main(String[] args) {
        new power().run();
    }

    public void myMainProgram() {
        this.power(2, 10);
    }

    int power(int base, int exponent) {
        if (exponent < 1) {
            return 1;
        } else if (exponent < 2) {
            return base;
        } else {
            return base * this.power(base, exponent - 1);
        }
    }
}
