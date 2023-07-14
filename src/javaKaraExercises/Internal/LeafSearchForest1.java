package javaKaraExercises.Internal;
import javakara.JavaKaraProgram;
public class LeafSearchForest1 extends JavaKaraProgram {
	void treeBypass() {
		kara.turnLeft();
		kara.move();
		kara.turnRight();
		kara.move();
		kara.move();
		kara.turnRight();
		kara.move();
		kara.turnLeft();
	}
	public void myProgram() {
		while (!kara.onLeaf()) {
			if (!kara.treeFront()) {
				kara.move();
			} else {
				this.treeBypass();
			}
		}
	}
}