package javaKaraExercises.External;

import javakara.JavaKaraProgram;

public class MirrorLeafRecursion extends JavaKaraProgram {
    public static void main(String[] args) {
        new MirrorLeafRecursion().run("C:\\Users\\Yaetrna\\IdeaProjects\\JavaKara\\src\\worlds\\MirrorLeafRecursion.world");
    }

    public void myMainProgram() {
        this.mirrorLeafRecursion();
    }

    void mirrorLeafRecursion() {
        if (!kara.onLeaf() && !kara.treeFront()) {
            kara.move();
            this.mirrorLeafRecursion();
            kara.move();
        } else if (kara.onLeaf()) {
            kara.removeLeaf();
            this.mirrorLeafRecursion();
            kara.putLeaf();
        } else if (kara.treeFront()) {
            this.takeMeBackToEden();
        }
    }

    void takeMeBackToEden() {
        kara.turnLeft();
        kara.move();
        kara.turnRight();
        kara.move();
        kara.move();
        kara.turnRight();
        kara.move();
        kara.turnLeft();
    }
}
