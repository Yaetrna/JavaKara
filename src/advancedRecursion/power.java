package advancedRecursion;

import javakara.JavaKaraProgram;

public class power extends JavaKaraProgram {
    private int recursiveCallCount = -1;
    private long startTime;

    public static void main(String[] args) {
        new power().run();
    }

    public void myMainProgram() {
        startTime = System.nanoTime();
        System.out.println(start(3, 2));
        this.printInformation();
    }

    long start(int x, int y) {
        recursiveCallCount++;
        if (y == 1) {
            return x;
        } else {
            return x * start(x, y - 1);
        }
    }

    void printInformation() {
        long endTime = System.nanoTime();
        long executionTime = (endTime - startTime) / 1000000;
        tools.showMessage("Recursive calls: " + recursiveCallCount + "\nTime: " + executionTime + "ms\n");
    }
}
