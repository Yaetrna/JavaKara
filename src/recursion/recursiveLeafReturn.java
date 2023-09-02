package recursion;

import javakara.JavaKaraProgram;

public class recursiveLeafReturn extends JavaKaraProgram {

  private int recursiveCallCount = -1;
  private long startTime;

  public static void main(String[] args) {
    String directory = System.getProperty("user.dir");
    String worldName = "recursiveLeafReturn";
    directory += "\\src\\worlds\\" + worldName + ".world";
    new recursiveLeafReturn().run(directory);
  }

  public void myMainProgram() {
    startTime = System.nanoTime();
    this.start();
    kara.putLeaf();
    this.printInformation();
  }

  void start() {
    if (!kara.onLeaf()) {
      if (kara.treeRight()) {
        kara.move();
        this.start();
        kara.move();
      } else {
        kara.turnRight();
        kara.move();
        this.start();
        kara.move();
        kara.turnLeft();
      }
    } else {
      kara.removeLeaf();
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
