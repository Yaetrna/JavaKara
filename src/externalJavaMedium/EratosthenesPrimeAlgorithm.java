package externalJavaMedium;
import javakara.JavaKaraProgram;

public class EratosthenesPrimeAlgorithm extends JavaKaraProgram {
  void initializeWorld() {
    world.setSize(10, 10);
    for (int x = 0; x < 10; x++) {
      for (int y = 0; y < 10; y++) {
        world.setLeaf(x, y, true);
      }
    }
  }
  int posX(int prime) {
      return prime % 10;
  }
  int posY(int prime) {
      return prime / 10;
  }
  void deleteAllMultiples(int prime) {
    for (int i = 2 * prime; i <= 100; i = i + prime) {
      world.setLeaf(posX(i - 1), posY(i - 1), false);
    }
  }
  public void myProgram() {
    initializeWorld();
    world.setLeaf(0, 0, false);
    for (int i = 2; i <= 100; i++) {
      this.deleteAllMultiples(i);
    }
  }
}
