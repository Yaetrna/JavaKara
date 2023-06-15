package javaKaraExercises.External.Draw;

import javakara.JavaKaraProgram;

public class MirrorColumns extends JavaKaraProgram {
  public static void main(String[] args) {
    new MirrorColumns().run("E:\\Development\\Projects\\Java\\JavaKara\\src\\worlds\\Columns.world");
  }

  public void myMainProgram() {
    for (int columns = 1; columns <= this.getWidthOfColumns(); columns++) {
      kara.turnLeft();
      this.mirrorColumns(columns);
    }
  }
  int getWidthOfColumns() {
    int counter = 0;
    kara.turnLeft();
    kara.move();
    while (kara.onLeaf()) {
      counter++;
      kara.move();
    }
    while (!kara.onLeaf()) {
      kara.move();
    }
    kara.turnLeft();
    kara.turnLeft();
    kara.move();
    kara.turnLeft();
    return counter;
  }

  void mirrorColumns(int distanceToNextColumn) {
    for (int steps = 0; steps < distanceToNextColumn; steps++) {
      kara.move();
    }
    if (kara.onLeaf()) {
      kara.turnLeft();
      kara.turnLeft();
    } else {
      
    }
  }
}
