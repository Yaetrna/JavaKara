package javaKaraExercises.Internal.Search;
import javakara.JavaKaraProgram;
public class LeafSearchForest2 extends JavaKaraProgram {
	void treeBypass() {
		kara.turnLeft();
		kara.move();
		kara.turnRight();
		kara.move();
		while (kara.treeRight()) {
			kara.move();
		}
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