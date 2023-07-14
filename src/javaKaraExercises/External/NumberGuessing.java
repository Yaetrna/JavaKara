package javaKaraExercises.External;
import javakara.JavaKaraProgram;
public class NumberGuessing extends JavaKaraProgram {
	void askRepeat() {
		String repeatGame = tools.stringInput("Would you like to play again? (Y/N)");
		if (repeatGame.equalsIgnoreCase("Y")) {
			this.myProgram();
		} else if (!repeatGame.equalsIgnoreCase("N")) {
			tools.showMessage("Invalid input! Try Again");
      this.askRepeat();
		}
	}
	public void myProgram() {
		int randomNumber = tools.random(99) + 1;
		int userInput;
		int attempts = 0;
		do {
			userInput = tools.intInput("Attempt No. " + attempts + "\n Please guess a number between 1 and 100: ");
			if (userInput < 1 || userInput > 100) {
				tools.showMessage("Number out of Scope! Try Again");
			} else if (userInput < randomNumber) {
				tools.showMessage("The number you guessed is too small, try again!");
				attempts++;
			} else if (userInput > randomNumber) {
				tools.showMessage("The number you guessed is too big, try again!");
				attempts++;
			}
		} while (userInput != randomNumber);
		tools.showMessage("You've guessed the correct number (" + randomNumber + ") after " + attempts + " attempts!");
		this.askRepeat();
	}
}
