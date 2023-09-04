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
      this.hyperX();
    printInformation();
  }

  void hyperX() {
    if (!kara.onLeaf()) {
      if (!kara.treeFront() && !kara.treeRight()) {
        kara.move();
        this.hyperX();
      } else if (kara.treeRight()) {
        this.logitech();
        this.hyperX();
      } else if (kara.treeFront()) {
        kara.turnRight();
      }
    }
    recursiveCallCount++;
  }

  void logitech() {
    if (kara.treeRight() && !kara.treeFront()) {
      kara.move();
      this.logitech();
    } else if (!kara.treeRight()) {
      kara.turnRight();
      kara.move();
    } else if (kara.treeRight() && kara.treeLeft() && kara.treeFront()) {
      kara.turnLeft();
      kara.turnLeft();
    } else if (kara.treeFront() && kara.treeLeft()) {
      kara.turnRight();
    } else if (kara.treeFront() && kara.treeRight()) {
      kara.turnLeft();
    }
  }

  void printInformation() {
    long endTime = System.nanoTime();
    long executionTime = (endTime - startTime) / 1000000;
    tools.showMessage("Recursive calls: " + recursiveCallCount + "\nTime: " + executionTime + "ms\n");
  }
}
