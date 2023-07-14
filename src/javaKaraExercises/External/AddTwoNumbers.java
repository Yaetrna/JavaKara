package javaKaraExercises.External;
import javakara.JavaKaraProgram;

public class AddTwoNumbers extends JavaKaraProgram {
  public static void main(String[] args) {
    new AddTwoNumbers().run();
  }

  public void myMainProgram() {
    int num1 = tools.intInput("Enter the first number: ");
    int num2 = tools.intInput("Enter the second number: ");
    tools.showMessage("Ergebnis: " + this.addInputs(num1, num2));
  }

  int addInputs(int num1, int num2) {
    return num1 + num2;
  }
}
