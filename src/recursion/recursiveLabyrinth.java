package recursion;

import javakara.JavaKaraProgram;

public class recursiveLabyrinth extends JavaKaraProgram {

  private int recursiveCallCount = -1;
  private long startTime;

  public static void main(String[] args) {
    String directory = System.getProperty("user.dir");
    String worldName = "recursiveLabyrinth";
    directory += "\\src\\worlds\\" + worldName + ".world";
    new recursiveLabyrinth().run(directory);
  }

  public void myMainProgram() {
    startTime = System.nanoTime();
    this.start();
    this.printInformation();
  }

  void start() {
    if (!kara.treeFront()) {
      kara.move();
      this.start();
      kara.move();
    } else if (kara.treeLeft()) {
      kara.turnRight();
      this.start();
      kara.turnLeft();
    } else if (kara.treeRight()) {
      kara.turnLeft();
      this.start();
      kara.turnRight();
    } else {
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
