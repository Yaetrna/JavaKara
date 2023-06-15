package javaKaraExercises.External.Spin;
import javakara.JavaKaraProgram;

public class SpinToWin4 extends JavaKaraProgram {
	void leafInvert() {
		if (kara.onLeaf()) {
			kara.removeLeaf();
		} else {
			kara.putLeaf();
		}
	}
	void spinBot() {
		for (int i = 1; i <= 8; i++) {
			kara.move();
			this.leafInvert();
			kara.turnRight();
		}
	}
	public void myProgram() {
		for (int i = 1; i <= 5; i++) {
			spinBot();
		}
	}
}
