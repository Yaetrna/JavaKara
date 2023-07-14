package javaKaraExercises.External;

import javakara.JavaKaraProgram;

public class Diamond extends JavaKaraProgram {
  public static void main(String[] args) {
    new Diamond().run();
  }

  public void myMainProgram() {
    world.setSize(100,100);
    kara.setPosition(50,50);
    this.kegelLegen(8);
  }

  boolean rechtsUm = true;
  void legeKegelreihe (int anzahl) {
    for (int i = 1; i <= anzahl; i++) {
      kara.putLeaf();
      kara.move();
      kara.turnLeft();
      kara.move();
      kara.turnRight();
    }
  }

  void zurNaechstenReihe() {
    if (rechtsUm) {
      kara.turnRight();
      kara.move();
      kara.move();
      kara.turnRight();
    } else {
      kara.turnLeft();
      kara.turnLeft();
      kara.move();
      kara.move();
    }
    rechtsUm = !rechtsUm;
  }

  void kegelLegen (int seite) {
    for (int i = 1; i <= seite; i++) {
      legeKegelreihe(seite);
      zurNaechstenReihe();
    }
  }
}
