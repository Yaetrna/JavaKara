package recursion;

import javakara.JavaKaraProgram;

public class recursivePacman extends JavaKaraProgram {

  private int recursiveCallCount = -1;
  private long startTime;

  public static void main(String[] args) {
    String directory = System.getProperty("user.dir");
    String worldName = "recursivePacman";
    directory += "\\src\\worlds\\" + worldName + ".world";
    new recursivePacman().run(directory);
  }

  public void myMainProgram() {
    startTime = System.nanoTime();
    this.start();
    this.printInformation();
  }

  void start() {
    if (!kara.mushroomFront()) {
      kara.removeLeaf();
      if (!kara.treeFront()) {
        kara.move();
        this.start();
        kara.move();
        kara.putLeaf();
      } else if (kara.treeLeft()) {
        kara.turnRight();
        kara.move();
        this.start();
        kara.move();
        kara.turnLeft();
        kara.putLeaf();
      } else {
        kara.turnLeft();
        kara.move();
        this.start();
        kara.move();
        kara.turnRight();
        kara.putLeaf();
      }
    } else {
      kara.removeLeaf();
      kara.turnLeft();
      kara.turnLeft();
      kara.putLeaf();
    }
    recursiveCallCount++;
  }

  void printInformation() {
    long endTime = System.nanoTime();
    long executionTime = (endTime - startTime) / 1000000;
    tools.showMessage("Recursive calls: " + recursiveCallCount + "\nTime: " + executionTime + "ms\n");
  }
}
