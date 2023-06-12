package internalJavaMedium;
import javakara.JavaKaraProgram;
public class II_AlongWall extends JavaKaraProgram {
	public void myProgram() {
		while	(true) {
			while (!kara.treeRight() && !kara.treeFront()) {
				kara.move();
			}
			while (kara.treeRight() && !kara.treeFront()) {
				kara.move();
			}
			if (!kara.treeRight()) {
				kara.turnRight();
				kara.move();
			}
			while	(kara.treeRight() && kara.treeFront()) {
				kara.turnLeft();
			}
		}
	}
}
