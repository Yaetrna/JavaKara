package test;

import javakara.JavaKaraProgram;

/**
 *

 description*
 @version 1.0 from 27.09.2023
 @author
 */

public class Speedrunning13 extends JavaKaraProgram {

    public static void main(String[] args) {
        JavaKaraProgram program = new Speedrunning13();
        program.run("Worlds/joeWiden.world");  // Alternativ: program.run("x:/data/test.world");
    }
    void turnAround() {
        kara.turnRight();
        kara.turnRight();
    }
    int count() {
        kara.putLeaf();
        int leaf=1;
        kara.move();
        if(kara.onLeaf()) {
            return leaf;
        } else {
            this.turnAround();
            kara.move();
            this.turnAround();
        }

        while (!kara.onLeaf()) {
            kara.move();
            leaf++;
        }
        return leaf;
    }

    int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1)+ fibonacci(n - 2);
        }
    }

    void shaitThemLeafs(int y) {
        for (int longer=1;longer<y;longer++) {
            kara.turnLeft();
            if (fibonacci(longer)<=100) {
                for (int detour = 0; detour<= fibonacci(longer); detour++) {
                    kara.putLeaf();
                    if(!kara.treeFront()) {
                        kara.move();
                    } else {
                        this.turnAround();
                        break;
                    }
                }
                this.turnAround();
                while (kara.onLeaf()) {
                    kara.move();
                }
                this.turnAround();
                kara.move();
                kara.turnRight();
                kara.move();
            }
        }
    }


    // Platz für Unterprogramme

    @Override
    public void myMainProgram() {
        int worldSizeY=this.count();
        this.shaitThemLeafs(worldSizeY);
    }
}
