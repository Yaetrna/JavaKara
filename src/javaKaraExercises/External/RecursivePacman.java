package javaKaraExercises.External;

import javakara.JavaKaraProgram;

public class RecursivePacman extends JavaKaraProgram {
  public static void main(String[] args) {
    new RecursivePacman().run("C:\\Users\\Yaetrna\\IdeaProjects\\JavaKara\\src\\worlds\\RecursivePacman.world");
  }

  public void myMainProgram() {
    this.recursiveLeafPlacer();
    tools.showMessage("Program has terminated.");
  }

  void recursiveLeafPlacer() {
    if (!kara.onLeaf()) {
      kara.putLeaf();
      this.recursiveLeafPlacer();
    }
    if (!kara.treeFront()) {
      if (kara.mushroomFront()) {
        kara.turnLeft();
        kara.turnLeft();
        this.getTheFuckOut();
        return;
      }
      kara.move();
      this.recursiveLeafPlacer();
    } else if (kara.treeLeft() && !kara.treeRight()) {
      kara.turnRight();
      this.recursiveLeafPlacer();
    } else if (!kara.treeLeft() && kara.treeRight()){
      kara.turnLeft();
      this.recursiveLeafPlacer();
    }
  }

  void getTheFuckOut() {
    if (!kara.treeFront()) {
      kara.move();
      this.getTheFuckOut();
    } else if (kara.treeLeft() && !kara.treeRight()) {
      kara.turnRight();
      this.getTheFuckOut();
    } else if (!kara.treeLeft() && kara.treeRight()) {
      kara.turnLeft();
      this.getTheFuckOut();
    }
  }
}
