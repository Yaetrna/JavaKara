package javaKaraExercises.Internal.Tunnel;
import javakara.JavaKaraProgram;
public class Tunnel2 extends JavaKaraProgram {
	public void myProgram() {
		while (!kara.treeLeft() || !kara.treeRight()) {
			kara.move();
		}
		while (kara.treeLeft() && kara.treeRight()) {
			kara.move();
		}
	}
}
