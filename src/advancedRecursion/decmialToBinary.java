package advancedRecursion;

import javakara.JavaKaraProgram;

public class decmialToBinary extends JavaKaraProgram {

    public static void main(String[] args) {
        new decmialToBinary().run();
    }

    public void myMainProgram() {
        for (int i = 1; i <= 65536; i++) {
            System.out.println(start(i, ""));
        }
    }

    String start(int decimal, String result) {
        if (decimal == 0) {
            return result;
        } else {
            result = decimal % 2 + result;
            return start(decimal / 2, result);
        }
    }
}
