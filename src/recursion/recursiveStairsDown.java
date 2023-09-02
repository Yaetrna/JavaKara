package recursion;

import javakara.JavaKaraProgram;

public class recursiveStairsDown extends JavaKaraProgram {

  private int recursiveCallCount = -1;
  private long startTime;

  public static void main(String[] args) {
    String directory = System.getProperty("user.dir");
    String worldName = "recursiveStairs";
    directory += "\\src\\worlds\\" + worldName + ".world";
    new recursiveStairsDown().run(directory);
  }

  public void myMainProgram() {
    startTime = System.nanoTime();
    this.start();
    this.printInformation();
  }

  void start() {
    if (kara.treeRight() && !kara.treeFront()) {
      kara.move();
      this.start();
      kara.move();
    } else if (kara.treeFront()) {
      kara.turnLeft();
      kara.move();
      kara.turnRight();
      kara.move();
      this.start();
      kara.turnRight();
      kara.move();
      kara.turnLeft();
      kara.move();
    } else {
      kara.turnLeft();
      kara.turnLeft();
      kara.move();
      kara.move();
      kara.turnLeft();
      kara.turnLeft();
    }
    recursiveCallCount++;
  }

  void printInformation() {
    long endTime = System.nanoTime();
    long executionTime = (endTime - startTime) / 1000000;
    tools.showMessage("Recursive calls: " + recursiveCallCount + "\nTime: " + executionTime + "ms\n");
  }
}
