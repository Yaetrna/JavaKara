package advancedRecursion;

import javakara.JavaKaraProgram;

public class fibonacci extends JavaKaraProgram {
    private long startTime;

    public static void main(String[] args) {
        new fibonacci().run();
    }

    public void myMainProgram() {
        startTime = System.nanoTime();
        System.out.println(this.start(75));
        this.printInformation();
    }

    long start(int n) {
        if (n < 3) {
            return 1;
        } else {
            return start(n - 1) + start(n - 2);
        }
    }

    void printInformation() {
        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime) / 1000000;
        tools.showMessage("Time: " + executionTime + "ms\n");
    }
}
