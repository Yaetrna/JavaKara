package advancedRecursion;

import javakara.JavaKaraProgram;

public class sumOfNaturalNumbers extends JavaKaraProgram {

    public static void main(String[] args) {
        new sumOfNaturalNumbers().run();
    }

    public void myMainProgram() {
        for (int i = 0; i <= 10_000; i++) {
            System.out.println(start(i));
        }
    }

    int start(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n + start(n - 1);
        }
    }
}
