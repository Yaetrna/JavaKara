package javaKaraExercises.External;

import javakara.JavaKaraProgram;

public class RecursiveLabyrinth extends JavaKaraProgram {
  public static void main(String[] args) {
    new RecursiveLabyrinth().run("C:\\Users\\Yaetrna\\IdeaProjects\\JavaKara\\src\\worlds\\RecursiveLabyrinth.world");
  }

  public void myMainProgram() {
    long startTime = System.currentTimeMillis();
    while (this.traverseLabyrinth());
    kara.move();
    while (this.traverseLabyrinth());
    long endTime = System.currentTimeMillis();
    long elapsedTimeMillis = endTime - startTime;
    tools.showMessage("Program has terminated. Time to Run: " + elapsedTimeMillis);
  }
  boolean traverseLabyrinth() {

    boolean noTreeFront = !kara.treeFront() && kara.treeRight() && kara.treeLeft();
    if (noTreeFront) {
      kara.move();
      return true;
    }

    boolean noTreeRight = !kara.treeRight() && kara.treeLeft() && kara.treeFront();
    if (noTreeRight) {
      kara.turnRight();
      kara.move();
      return true;
    }

    boolean noTreeLeft = !kara.treeLeft() && kara.treeRight() && kara.treeFront();
    if (noTreeLeft) {
      kara.turnLeft();
      kara.move();
      return true;
    }
    this.turn180Degrees();
    return false;
  }

  void turn180Degrees() {
    kara.turnRight();
    kara.turnRight();
  }
}
