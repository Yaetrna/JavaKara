package javaKaraExercises.External.Draw;
import javakara.JavaKaraProgram;

public class Shapes extends JavaKaraProgram {
	void square() {
		for (int y = 0; y < 100; y++) {
			for (int x = 0; x < 100; x++) {
				world.setLeaf(x,y,true);
			}
		}
	}
	// Schmutz:
	void bottomLeftTriangle() {
		for (int y = 0; y < 100; y++) {
			for (int x = 0; x <= y; x++) {
				world.setLeaf(x,y,true);
			}
		}
	}
	// Schmutz:
	void topLeftTriangle() {
		for (int y = 0; y < 100; y++) {
			for (int x = 0; x < 100 - y; x++) {
				world.setLeaf(x,y,true);
			}
		}
	}
	// Schmutz:
	void bottomRightTriangle() {
		for (int y = 0; y < 100; y++) {
			for (int x = 99; x > 98 - y; x--) {
				world.setLeaf(x,y,true);
			}
		}
	}
	// Schmutz:
	void topRightTriangle() {
		for (int y = 0; y < 100; y++) {
			for (int x = 99; x >= y ; x--) {
				world.setLeaf(x,y,true);
			}
		}
	}
	public void myProgram() {
		world.clearAll();
		this.topLeftTriangle();
		world.clearAll();
		this.bottomLeftTriangle();
		world.clearAll();
		this.bottomRightTriangle();
		world.clearAll();
		this.topRightTriangle();
		world.clearAll();
	}
}
