package javaKaraExercises.External.Draw;
import javakara.JavaKaraProgram;

public class ShapeKara extends JavaKaraProgram {
  public static void main(String[] args) {
    JavaKaraProgram program = new ShapeKara();
    program.run();
  }

  public void myMainProgram() {
    kara.setPosition(0,0);
    this.drawHollowRectangle(1, 5);
  }

  void drawHollowRectangle(int width, int height) {
    try {
      if (width <= 2 || height <= 2) {
        throw new IllegalArgumentException();
      }
    this.fillAndReturn(width);
    for (int y = 1; y < height - 1; y++) {
      this.putX(width);
      this.turnAround();
      kara.move();
      this.delX(width - 2);
      kara.move();
      kara.turnLeft();
      kara.move();
      kara.turnLeft();
    }
    this.fillAndReturn(width);
    } catch (IllegalArgumentException e) {
      tools.showMessage("Width and/or Height cannot be less than 2");
    }
  }

  void drawTriangle(int size) {
    for (int y = 1; y <= size; y++) {
      this.fillAndReturn(y);
    }
  }

  void drawRectangle(int width, int height) {
    for (int y = 0; y < height; y++) {
      this.fillAndReturn(width);
    }
  }

  void drawSquare(int size) {
    for (int i = 0; i < size; i++) {
      this.fillAndReturn(size);
    }
  }

  void fillAndReturn(int size) {
    this.putX(size);
    this.turnAround();
    this.moveX(size);
    kara.turnLeft();
    kara.move();
    kara.turnLeft();
  }

  void turnAround() {
    kara.turnLeft();
    kara.turnLeft();
  }
  void putX(int amount) {
    for (int i = 0; i < amount; i++) {
      kara.putLeaf();
      kara.move();
    }
  }

  void delX(int amount) {
    for (int i = 0; i < amount; i++) {
      kara.move();
      kara.removeLeaf();
    }
  }

  void moveX(int amount) {
    for (int i = 0; i < amount; i++) {
      kara.move();
    }
  }
}
