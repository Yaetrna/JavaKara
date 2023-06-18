package javaKaraExercises.External.Draw;

import javakara.JavaKaraProgram;

public class MirrorColumns extends JavaKaraProgram {
  public static void main(String[] args) {
    new MirrorColumns().run("C:\\Users\\Yaetrna\\IdeaProjects\\JavaKara\\src\\worlds\\Columns.world");
  }

  public void myMainProgram() {
    int steps = 1;
    int counter = 0;
    while (kara.getPosition().x != 0) {
      if (this.leafLeft(steps)) {
        kara.putLeaf();
        kara.move();
        counter++;
      } else {
        this.turnAround();
        for (int i = 0; i < counter; i++) {
          kara.move();
        }
        counter = 0;
        kara.turnLeft();
        kara.move();
        kara.turnLeft();
        steps += 2;
      }
    }
  }
  boolean leafLeft(int steps) {
    kara.turnLeft();
    for (int i = 0; i < steps; i++) {
      kara.move();
    }
    if (kara.onLeaf()) {
      this.karaReturn(steps);
      return true;
    } else {
      this.karaReturn(steps);
      return false;
    }
  }
  void turnAround() {
    kara.turnLeft();
    kara.turnLeft();
  }

  void karaReturn(int steps) {
    this.turnAround();
    for (int i = 0; i < steps; i++) {
      kara.move();
    }
    kara.turnLeft();
  }
}
