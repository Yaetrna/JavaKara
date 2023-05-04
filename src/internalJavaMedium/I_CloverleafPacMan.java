package internalJavaMedium;
import javakara.JavaKaraProgram;
public class I_CloverleafPacMan extends JavaKaraProgram {
	void checkForLeaf() {
		kara.turnLeft();
		kara.turnLeft();
		kara.move();
		kara.turnLeft();
		kara.move();
		if (!kara.onLeaf()) {
			kara.turnLeft();
			kara.turnLeft();
			kara.move();
			kara.move();
			if (!kara.onLeaf()) {
				tools.showMessage("No leaf near!");
			}
		}
	}
	public void myProgram() {
		for (;;) {
			if (kara.onLeaf()) {
				kara.removeLeaf();
				if (kara.treeFront()) {
					tools.showMessage("I'm so full, \nI don't like leaves!");
					return;
				}
				kara.move();
			} else {
				checkForLeaf();
			}
			if (kara.treeFront()) {
				if (kara.onLeaf()) {
					kara.removeLeaf();
				}
				break;
			}
		}
	}
}
