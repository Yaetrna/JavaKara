package advancedRecursion;

import javakara.JavaKaraProgram;

public class factorial extends JavaKaraProgram {
    private int recursiveCallCount = -1;
    private long startTime;

    public static void main(String[] args) {
        new factorial().run();
    }

    public void myMainProgram() {
        startTime = System.nanoTime();
        System.out.println(this.start(20));
        this.printInformation();
    }

    long start(int n) {
        recursiveCallCount++;
        if (n == 0) {
            return 1;
        } else {
            return n * start(n - 1);
        }
    }

    long start_iterative(int n) {
        long prod = 1;
        for (int i = n; i > 1; i--) {
            prod *= i;
        }
        return prod;
    }

    void printInformation() {
        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime) / 1000000;
        tools.showMessage("Recursive calls: " + recursiveCallCount + "\nTime: " + executionTime + "ms\n");
    }
}
