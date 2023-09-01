package recursion;

import javakara.JavaKaraProgram;

public class recursiveLeafCollect extends JavaKaraProgram {

  private int recursiveCallCount = -1;
  private long startTime;

  public static void main(String[] args) {
    new recursiveLeafCollect().run();
  }

  public void myMainProgram() {
    this.createWorld();
    startTime = System.nanoTime();
    this.start();
    this.printInformation();
  }

  void start() {
    if (!kara.onLeaf()) {
      kara.move();
      this.start();
      kara.move();
    } else {
      kara.removeLeaf();
      kara.turnLeft();
      kara.turnLeft();
    }
    recursiveCallCount++;
  }

  void outOfBoxSolution() {
    if (!kara.onLeaf()) {
      kara.move();
      this.outOfBoxSolution();
    } else {
      kara.removeLeaf();
      kara.move();
      kara.putLeaf();
    }
    recursiveCallCount++;
  }

  void createWorld() {
    world.setSize(12, 1);
    world.setLeaf(11, 0, true);
    kara.setPosition(0, 0);
  }

  void printInformation() {
    long endTime = System.nanoTime();
    long executionTime = (endTime - startTime) / 1000000;
    tools.showMessage("Recursive calls: " + recursiveCallCount + "\nTime: " + executionTime + "ms\n");
  }
}
