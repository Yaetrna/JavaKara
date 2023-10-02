package recursionSpeedRun;

import javakara.JavaKaraProgram;

public class factorial extends JavaKaraProgram {

    public static void main(String[] args) {
        new factorial().run();
    }

    public void myMainProgram() {
        System.out.println(this.factorial(10));
    }

    int factorial(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * this.factorial(n - 1);
        }
    }
}
