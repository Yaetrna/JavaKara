package recursion;

import javakara.JavaKaraProgram;

public class recursiveLeafMirror extends JavaKaraProgram {

  private int recursiveCallCount = -1;
  private long startTime;

  public static void main(String[] args) {
    new recursiveLeafMirror().run();
  }

  public void myMainProgram() {
    this.createWorld();
    startTime = System.nanoTime();
    this.start();
    this.printInformation();
  }

  void start() {
    if (!kara.treeFront() && !kara.onLeaf()) {
      kara.move();
      this.start();
      kara.move();
    } else if (kara.onLeaf()) {
      kara.removeLeaf();
      this.start();
      kara.putLeaf();
    } else {
      this.bypassTree();
    }
    recursiveCallCount++;
  }

  void bypassTree() {
    kara.turnRight();
    kara.move();
    kara.turnLeft();
    kara.move();
    kara.move();
    kara.turnLeft();
    kara.move();
    kara.turnRight();
  }

  void createWorld() {
    world.setSize(23, 2);
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
