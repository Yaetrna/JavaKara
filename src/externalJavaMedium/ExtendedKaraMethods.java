package externalJavaMedium;

import javakara.JavaKaraProgram;

public class ExtendedKaraMethods extends JavaKaraProgram {
  public static void main(String[] args) {
    new ExtendedKaraMethods().run();
  }

  public void myMainProgram() {
    kara.setPosition(0,0);
  }

  boolean leafLeft() {
    kara.turnLeft();
    if (kara.treeFront()) {
      return false;
    }
    kara.move();
    if (kara.onLeaf()) {
      kara.turnLeft();
      kara.turnLeft();
      kara.move();
      kara.turnLeft();
      return true;
    }
    return false;
  }
  boolean leafRight() {
    kara.turnRight();
    if (kara.treeFront()) {
      return false;
    }
    kara.move();
    if (kara.onLeaf()) {
      kara.turnRight();
      kara.turnRight();
      kara.move();
      kara.turnRight();
      return true;
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
    }
    return false;
  }

}
