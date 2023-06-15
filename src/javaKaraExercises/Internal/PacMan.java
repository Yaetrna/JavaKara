package javaKaraExercises.Internal;
import javakara.JavaKaraProgram;
public class PacMan extends JavaKaraProgram {
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
