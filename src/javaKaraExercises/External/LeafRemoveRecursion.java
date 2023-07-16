package javaKaraExercises.External;

import javakara.JavaKaraProgram;

public class LeafRemoveRecursion extends JavaKaraProgram {
    public static void main(String[] args) {
        new LeafRemoveRecursion().run("C:\\Users\\Yaetrna\\IdeaProjects\\JavaKara\\src\\worlds\\LeafRemoveRecursion.world");
    }

    public void myMainProgram() {
        this.recursiveKaraWalk();
    }

    void recursiveKaraWalk() {
        if (!kara.treeFront()) {
            kara.move();
        } else {
            kara.turnLeft();
            kara.turnLeft();
            return;
        }
        if (kara.onLeaf()) {
            kara.removeLeaf();
        }
        this.recursiveKaraWalk();
    }
}
