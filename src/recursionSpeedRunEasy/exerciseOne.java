package recursionSpeedRunEasy;

import javakara.JavaKaraProgram;

public class exerciseOne extends JavaKaraProgram {

  public static void main(String[] args) {
    new exerciseOne().run();
  }

  public void myMainProgram() {
    for (int i = 0; i < 200; i++) {
      world.setSize(10, 1);
      world.setTree(9, 0, true);
      kara.setPosition(0, 0);
      for (int y = 1; y < 10; y++) {
        int x = tools.random(8);
        world.setLeaf(x, 0, true);
      }
      this.solution();
      world.clearAll();
    }
  }

  void solution() {
    if (kara.onLeaf()) {
      kara.removeLeaf();
    }
    if (!kara.treeFront()) {
      kara.move();
      this.solution();
    } else {
      kara.turnLeft();
      kara.turnLeft();
    }
  }
}
