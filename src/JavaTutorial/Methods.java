package JavaTutorial;

public class Methods {
	static double solution;
	public static double addTwoNumbers(int x, int y) {
		solution = x + y;
		return solution;
	}
	public static void main(String[] args) {
		int x = 12;
		int y = 42;
		System.out.println(addTwoNumbers(x, y));
	}
}
