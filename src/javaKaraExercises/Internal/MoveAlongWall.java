package javaKaraExercises.Internal;
import javakara.JavaKaraProgram;
public class MoveAlongWall extends JavaKaraProgram {
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
