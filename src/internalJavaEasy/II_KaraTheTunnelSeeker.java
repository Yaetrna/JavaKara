package internalJavaEasy;
import javakara.JavaKaraProgram;
public class II_KaraTheTunnelSeeker extends JavaKaraProgram {
	public void myProgram() {
		while (!kara.treeLeft() || !kara.treeRight()) {
			kara.move();
		}
	}
}
