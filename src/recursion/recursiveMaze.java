package recursion;

import javakara.JavaKaraProgram;

public class recursiveMaze extends JavaKaraProgram {

  private int recursiveCallCount = -1;
  private long startTime;

  public static void main(String[] args) {
    String directory = System.getProperty("user.dir");
    String worldName = "recursiveMaze";
    directory += "\\src\\worlds\\" + worldName + ".world";
    new recursiveMaze().run(directory);
  }

  public void myMainProgram() {
    int x;
    int y;
    do {
      x = tools.random(30);
      y = tools.random(20);
    } while (world.isTree(x, y));
    kara.setPosition(x, y);
    startTime = System.nanoTime();
    this.start();
    printInformation();
  }

  void start() {
    if (!kara.treeFront()) {
      kara.move();
      this.start();
      kara.move();
    } else {
      kara.turnLeft();
      this.navigate();
      kara.turnRight();
    }
  }

  void navigate() {
    if (!kara.onLeaf()) {
      if (!kara.treeRight()) {
        kara.turnRight();
        kara.move();
        this.navigate();
        kara.move();
        kara.turnLeft();
      } else if (kara.treeFront()) {
        kara.turnLeft();
        this.navigate();
        kara.turnRight();
      } else {
        kara.move();
        this.navigate();
        kara.move();
      }
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
