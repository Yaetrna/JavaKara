package recursion;

import javakara.JavaKaraProgram;

public class recursiveWalk extends JavaKaraProgram {
  private int recursiveCallCount = -1;
  private long startTime;

  public static void main(String[] args) {
    new recursiveWalk().run();
  }

  public void myMainProgram() {
    this.createWorld();
    startTime = System.nanoTime();
    this.start();
    this.printInformation();
  }

  void start() {
    if (!kara.treeFront()) {
      if (kara.onLeaf()) {
        kara.removeLeaf();
      }
      kara.move();
      this.start();
    } else {
      kara.turnLeft();
      kara.turnLeft();
    }
    recursiveCallCount++;
  }

  void createWorld() {
    world.setSize(12, 1);
    world.setTree(11, 0, true);
    for (int i = 0; i < 5; i++) {
      world.setLeaf(tools.random(10), 0, true);
    }
    kara.setPosition(0, 0);
  }

  void printInformation() {
    long endTime = System.nanoTime();
    long executionTime = (endTime - startTime) / 1000000;
    tools.showMessage("Recursive calls: " + recursiveCallCount + "\nTime: " + executionTime + "ms\n");
  }
}
