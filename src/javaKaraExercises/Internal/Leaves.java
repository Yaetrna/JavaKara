package javaKaraExercises.Internal;
import javakara.JavaKaraProgram;
public class Leaves extends JavaKaraProgram {
	void leafInversion() {
		if (kara.onLeaf()) {
			kara.removeLeaf();
		}
		else {
			kara.putLeaf();
		}
	}
	public void myProgram() {
		while (!kara.treeFront()) {
			this.leafInversion();
			kara.move();
		}
		this.leafInversion();
	}
}
