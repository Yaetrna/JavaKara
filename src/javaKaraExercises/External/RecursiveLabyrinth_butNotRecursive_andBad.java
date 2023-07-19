package javaKaraExercises.External;

import javakara.JavaKaraProgram;

public class RecursiveLabyrinth_butNotRecursive_andBad extends JavaKaraProgram {
  public static void main(String[] args) {
    String current_directory = System.getProperty("user.dir");
    String world_file_name = "RecursiveLabyrinth";
    current_directory += "\\src\\worlds\\"+world_file_name+".world";
    System.out.println(current_directory);
    new RecursiveLabyrinth_butNotRecursive_andBad().run(current_directory);
  }

  public void myMainProgram() {
    long startTime = System.currentTimeMillis();
    while (this.traverseLabyrinth());
    kara.move();
    while (this.traverseLabyrinth());
    long endTime = System.currentTimeMillis();
    long elapsedTimeMillis = endTime - startTime;
    tools.showMessage("Program has terminated. Time to Run: " + elapsedTimeMillis); //25848
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
