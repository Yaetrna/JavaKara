package internalJavaEasy;
import javakara.JavaKaraProgram;
public class I_KaraAndTheLeaves extends JavaKaraProgram {
	void leafInversion() {
		if (kara.onLeaf()) {
			kara.removeLeaf();
		}
		else {
			kara.putLeaf();
		}
	}
	public void myProgram() {
		while (!kara.treeFront()) {
			this.leafInversion();
			kara.move();
		}
		this.leafInversion();
	}
}
