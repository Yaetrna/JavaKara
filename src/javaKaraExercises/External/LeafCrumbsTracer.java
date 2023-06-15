package javaKaraExercises.External;

import javakara.JavaKaraProgram;

public class LeafCrumbsTracer extends JavaKaraProgram {
  public static void main(String[] args) {
    new LeafCrumbsTracer().run("E:\\Development\\Projects\\Java\\JavaKara\\src\\worlds\\BigLabyrinth.world");
  }

  public void myMainProgram() {
    if (kara.onLeaf()) {
      kara.removeLeaf();
    }
    while (!kara.mushroomFront()) {
      if (this.leafFront()) {
        kara.move();
        kara.removeLeaf();
      } else if (this.leafRight()) {
        kara.turnRight();
        kara.move();
        kara.removeLeaf();
      } else if (this.leafLeft()) {
        kara.turnLeft();
        kara.move();
        kara.removeLeaf();
      }
    }
  }

  boolean leafLeft() {
    kara.turnLeft();
    if (kara.treeFront()) {
      kara.turnRight();
      return false;
    }
    kara.move();
    if (kara.onLeaf()) {
      kara.turnLeft();
      kara.turnLeft();
      kara.move();
      kara.turnLeft();
      return true;
    } else {
      kara.turnLeft();
      kara.turnLeft();
      kara.move();
      this.myMainProgram();
    }
    return false;
  }
  boolean leafRight() {
    kara.turnRight();
    if (kara.treeFront()) {
      kara.turnLeft();
      return false;
    }
    kara.move();
    if (kara.onLeaf()) {
      kara.turnRight();
      kara.turnRight();
      kara.move();
      kara.turnRight();
      return true;
    } else {
      kara.turnRight();
      kara.turnRight();
      kara.move();
      this.myMainProgram();
    }
    return false;
  }
  boolean leafFront() {
    if (kara.treeFront()) {
      return false;
    }
    kara.move();
    if (kara.onLeaf()) {
      kara.turnRight();
      kara.turnRight();
      kara.move();
      kara.turnRight();
      kara.turnRight();
      return true;
    } else {
      kara.turnRight();
      kara.turnRight();
      kara.move();
    }
    return false;
  }
}
