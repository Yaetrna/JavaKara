package advancedRecursion;

import javakara.JavaKaraProgram;

public class fibonacci extends JavaKaraProgram {
    private long startTime;

    public static void main(String[] args) {
        new fibonacci().run();
    }

    public void myMainProgram() {
        startTime = System.nanoTime();
        System.out.println(this.start_iterative(55));
        this.printInformation();
    }

    long start(int n) {
        if (n < 1) {
            return 0;
        } else if (n < 3) {
            return 1;
        } else {
            return start(n - 1) + start(n - 2);
        }
    }

    long start_iterative(int n) {
        long a = 0;
        long b = 1;
        for (long x = 0; x < n; x++) {
            long temp = a;
            a = b;
            b = temp + a;
        }
        return a;
    }

    void printInformation() {
        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime);
        tools.showMessage("Time: " + executionTime + "ns\n");
    }
}
