package javaKaraExercises.External;

import javakara.JavaKaraProgram;

public class LeafReturnRecursion extends JavaKaraProgram {
    public static void main(String[] args) {
        new LeafReturnRecursion().run("C:\\Users\\Yaetrna\\IdeaProjects\\JavaKara\\src\\worlds\\ReturnLeafRecursion.world");
    }

    public void myMainProgram() {
        this.recursiveReturnLeaf();
        kara.putLeaf(); // Not the most elegant solution but I'm fucking lazy.
    }

    void recursiveReturnLeaf() {
        if (!kara.onLeaf()) {
            kara.move();
            this.recursiveReturnLeaf();
            kara.move();
        } else {
            kara.removeLeaf();
            kara.turnLeft();
            kara.turnLeft();
        }
    }
}
