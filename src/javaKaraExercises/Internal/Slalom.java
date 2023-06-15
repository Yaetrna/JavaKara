package javaKaraExercises.Internal;
import javakara.JavaKaraProgram;
public class Slalom extends JavaKaraProgram {
	public void myProgram() {
		this.turnLeft();
	}
	void turnLeft() {
		kara.move();
		kara.turnLeft();
		kara.move();
		kara.move();
		kara.turnLeft();
		kara.move();
	}
	void turnRight() {
		kara.move();
		kara.turnRight();
		kara.move();
		kara.move();
		kara.turnRight();
		kara.move();
	}
}
