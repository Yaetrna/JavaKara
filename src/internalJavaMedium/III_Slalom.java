package internalJavaMedium;
import javakara.JavaKaraProgram;
public class III_Slalom extends JavaKaraProgram {
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
