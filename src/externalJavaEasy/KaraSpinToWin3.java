import javakara.JavaKaraProgram;

public class KaraSpinToWin3 extends JavaKaraProgram {
	void spinBot() {
		for (int i = -1; i >= -8; i--) {
			kara.move();
			kara.turnRight();
		}
	}
	public void myProgram() {
		for (int i = 1; i <= 5; i++) {
			spinBot();
		}
	}
}
