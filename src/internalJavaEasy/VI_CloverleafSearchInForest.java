package internalJavaEasy;
import javakara.JavaKaraProgram;
public class VI_CloverleafSearchInForest extends JavaKaraProgram {
	public void myProgram() {
		while (!kara.onLeaf()) {
			if (kara.treeFront() && !kara.treeRight()) {
				kara.turnRight();
			} else if (kara.treeFront() && !kara.treeLeft()) {
				kara.turnLeft();
			} else if (!kara.treeFront()) {
				kara.move();
			}
		}
	}
}
