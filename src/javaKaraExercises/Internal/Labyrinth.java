package javaKaraExercises.Internal;
import javakara.JavaKaraProgram;
public class Labyrinth extends JavaKaraProgram {
	void leftExit() {
		kara.turnLeft();
		kara.move();
		kara.move();
		kara.turnLeft();
	}
	void rightExit() {
		kara.turnRight();
		kara.move();
		kara.move();
		kara.turnRight();
	}
	public void myProgram() {
		while (!kara.onLeaf()) {
			while (kara.treeRight() && kara.turnLeft() && !kara.treeFront()) {
				kara.move();
			}
			if (!kara.treeLeft()) {
				this.leftExit();
			} else if (!kara.treeRight()) {
				this.rightExit();
			} else {
				kara.turnRight();
				kara.turnRight();
			}
		}
		kara.removeLeaf();
	}
}
