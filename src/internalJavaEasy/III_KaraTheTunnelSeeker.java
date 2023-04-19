package internalJavaEasy;
import javakara.JavaKaraProgram;
public class III_KaraTheTunnelSeeker extends JavaKaraProgram {
	public void myProgram() {
		while (!kara.treeLeft() || !kara.treeRight()) {
			kara.move();
		}
		while (kara.treeLeft() && kara.treeRight()) {
			kara.move();
		}
	}
}
