package javaKaraExercises.External.Math;
import javakara.JavaKaraProgram;

public class EratosthenesPrimeAlgorithm extends JavaKaraProgram {

  public static void main(String[] args) {
    new EratosthenesPrimeAlgorithm().run();
  }

  final int xSize = 175;
  final int ySize = 175;

  void initializeWorld() {
    world.setSize(xSize, ySize);
    for (int x = 0; x < xSize; x++) {
      for (int y = 0; y < ySize; y++) {
        world.setLeaf(x, y, true);
      }
    }
  }
  /*
  / Die x-Position einer beliebigen Zahl ist der Rest nach der Division.
  / Zum Beispiel: Die Zahl (63 - 1) / 10 = 6 und der Rest ist 2.
  / Daher ist die x-Position von 63 gleich 2.
  */
  int posX(int x) {
      return x % xSize;
  }
  /*
  / Die y-Position einer beliebigen Zahl ist die Division als ganze Zahl.
  / Die Nachkommastelle ist überflüssig, da es keine Koordinaten mit Nachkommastellen gibt.
  / Zum Beispiel: Die Zahl (63 - 1) / 10 = 6,2 -> 6.
  / Daher ist die y-Position von 63 gleich 6.
  */
  int posY(int y) {
      return y / ySize;
  }

  // Löscht alle Vielfachen von x aus der Hauptmethode (außer x selbst).
  void deleteAllMultiples(int xNum) {
    for (int i = 2 * xNum; i <= (xSize * ySize); i = i + xNum) {
      // i muss um 1 subtrahiert werden, da die Weltkoordinaten mit 0, die Zahlen aber mit 1 beginnen.
      world.setLeaf(posX(i - 1), posY(i - 1), false);
    }
  }
  public void myMainProgram() {
    world.clearAll();
    initializeWorld();
    world.setLeaf(0, 0, false);

    // Diese For-Schleife durchläuft jede Zahl, ob Primzahl oder nicht.
    // Sie geht von x = 2 (da 2 die kleinste Primzahl ist) bis zu x = Breite * Höhe der Welt.
    for (int x = 2; x <= (xSize * ySize); x++) {
      this.deleteAllMultiples(x);
    }
  }
}
