package javaKaraExercises.External;

import javakara.JavaKaraProgram;

public class RecursiveLabyrinth extends JavaKaraProgram {
    public static void main(String[] args) {
        String current_directory = System.getProperty("user.dir");
        String world_file_name = "RecursiveLabyrinth";
        current_directory += "\\src\\worlds\\"+world_file_name+".world";
        System.out.println(current_directory);
        new RecursiveLabyrinth().run(current_directory);
    }

    public void myMainProgram() {
        long startTime = System.currentTimeMillis();
        this.traverseLabyrinth();
        long endTime = System.currentTimeMillis();
        long elapsedTimeMillis = endTime - startTime;
        tools.showMessage("Program has terminated. Time to Run: " + elapsedTimeMillis); //16379
    }
    void traverseLabyrinth(){
    boolean noTreeFront = !kara.treeFront() && kara.treeRight() && kara.treeLeft();
        if (noTreeFront) {
        kara.move();
        traverseLabyrinth();
        kara.move();
        return;
    }

    boolean noTreeRight = !kara.treeRight() && kara.treeLeft() && kara.treeFront();
        if (noTreeRight) {
        kara.turnRight();
        kara.move();
        traverseLabyrinth();
        kara.move();
        kara.turnLeft();
        return;
    }

    boolean noTreeLeft = !kara.treeLeft() && kara.treeRight() && kara.treeFront();
        if (noTreeLeft) {
        kara.turnLeft();
        kara.move();
        traverseLabyrinth();
        kara.move();
        kara.turnRight();
        return;
    }
        this.turn180Degrees();
}

    void turn180Degrees() {
        kara.turnRight();
        kara.turnRight();
    }
}
