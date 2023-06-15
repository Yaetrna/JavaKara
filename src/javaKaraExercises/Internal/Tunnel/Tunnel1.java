package javaKaraExercises.Internal.Tunnel;
import javakara.JavaKaraProgram;
public class Tunnel1 extends JavaKaraProgram {
	public void myProgram() {
		while (!kara.treeLeft() || !kara.treeRight()) {
			kara.move();
		}
	}
}
