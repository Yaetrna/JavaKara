package internalJavaMedium;
import javakara.JavaKaraProgram;
public class I_CloverleafPacMan extends JavaKaraProgram {
	public void myProgram() {
		kara.removeLeaf();
		while (!kara.treeFront()) {
			kara.move();
			if (!kara.onLeaf()) {
				turnAround();
				kara.turnRight();
				kara.move();
				if (!kara.onLeaf()) {
					turnAround();
					kara.move();
				}
			}
			kara.removeLeaf();
		}
	}
	void turnAround() {
		kara.turnLeft();
		kara.turnLeft();
		kara.move();
	}
}
