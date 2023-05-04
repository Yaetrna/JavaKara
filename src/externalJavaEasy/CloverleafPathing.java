package externalJavaEasy;
import javakara.JavaKaraProgram;
public class CloverleafPathing extends JavaKaraProgram {
	void layRight() {
		kara.turnRight();
		kara.move();
		kara.putLeaf();
		kara.turnLeft();
		kara.turnLeft();
		kara.move();
		kara.turnRight();
	}
	public void myProgram() {
		while (!kara.treeFront()) {
			if (kara.onLeaf()) {
				this.layRight();
			}
			kara.move();
		}
    if (kara.onLeaf()) {
	    this.layRight();
    }
	}
}
