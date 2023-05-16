package externalJavaMedium;
import javakara.JavaKaraProgram;

public class EratosthenesPrimeAlgorithm extends JavaKaraProgram {

  final int xSize = 100;
  final int ySize = 100;

  void initializeWorld() {
    world.setSize(xSize, ySize);
    for (int x = 0; x < xSize; x++) {
      for (int y = 0; y < ySize; y++) {
        world.setLeaf(x, y, true);
      }
    }
  }
  /*
  /  The x-position of any number is the remainder after division.
  /  For example: The number (63 - 1) / 10 = 6 and the remainder is 2.
  /  Therefore, the x-position of 63 is 2.
  */
  int posX(int x) {
      return x % xSize;
  }
  /*
  /  The y-position of any number is the division as an integer.
  /  The decimal place is redundant, because there are no coordinates with decimal places.
  /  For example: The number (63 - 1) / 10 = 6.2 -> 6.
  /  Therefore, the y-position of 63 is 6.
  */
  int posY(int y) {
      return y / ySize;
  }

  // Deletes all multiples of x from the main method (except x itself).
  void deleteAllMultiples(int xNum) {
    for (int i = 2 * xNum; i <= (xSize * ySize); i = i + xNum) {
      // i must be subtracted by 1, because the world coordinates start with 0, but the numbers start with 1.
      world.setLeaf(posX(i - 1), posY(i - 1), false);
    }
  }
  public void myProgram() {
    world.clearAll();
    initializeWorld();
    world.setLeaf(0, 0, false);

    // This For-Loop iterates over every number, prime or not.
    // It starts with x equal to 2 (first prime) and ends when x is equal to the number of tiles in the world.
    for (int x = 2; x <= (xSize * ySize); x++) {
      this.deleteAllMultiples(x);
    }
  }
}
