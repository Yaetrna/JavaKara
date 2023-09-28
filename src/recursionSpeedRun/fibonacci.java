package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class fibonacci extends JavaKaraProgram {

    public static void main(String[] args) {
        new fibonacci().run();
    }

    public void myMainProgram() {
        System.out.println(this.fibonacci(10));
    }

    int fibonacci(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 2) {
            return 1;
        } else {
            return this.fibonacci(n - 1) + this.fibonacci(n - 2);
        }
    }
}
