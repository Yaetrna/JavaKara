package javaKaraExercises.External;

import javakara.JavaKaraProgram;

import java.util.ArrayList;

public class RecursiveLabyrinth_butNotRecursive extends JavaKaraProgram {

    public static void main(String[] args) {
        String current_directory = System.getProperty("user.dir");
        String world_file_name = "RecursiveLabyrinth";
        current_directory += "\\src\\worlds\\"+world_file_name+".world";
        System.out.println(current_directory);
        new RecursiveLabyrinth_butNotRecursive().run(current_directory);
    }
    public void myMainProgram() {
        long startTime = System.currentTimeMillis();
        ArrayList<Integer> skull = new ArrayList<>();
        boolean exit_condition;
        while (true){
            skull.add(traverseLabyrinth());
            exit_condition = skull.get(skull.size()-1) == 0;
            if(exit_condition) break;
        }
        for (int i = skull.size()-2; i>=0; i--){
            switch (skull.get(i)){
                case 1:
                    kara.move();
                    break;
                case 2:
                    kara.move();
                    kara.turnLeft();
                    break;
                case 3:
                    kara.move();
                    kara.turnRight();
                    break;
                default:
                    System.out.println("This should not happen :)");
            }
        }
        long endTime = System.currentTimeMillis();
        long elapsedTimeMillis = endTime - startTime;
        tools.showMessage("Program has terminated. Time to Run: " + elapsedTimeMillis); //16368
    }

    int traverseLabyrinth() {

        boolean noTreeFront = !kara.treeFront() && kara.treeRight() && kara.treeLeft();
        if (noTreeFront) {
            kara.move();
            return 1;
        }

        boolean noTreeRight = !kara.treeRight() && kara.treeLeft() && kara.treeFront();
        if (noTreeRight) {
            kara.turnRight();
            kara.move();
            return 2;
        }

        boolean noTreeLeft = !kara.treeLeft() && kara.treeRight() && kara.treeFront();
        if (noTreeLeft) {
            kara.turnLeft();
            kara.move();
            return 3;
        }
        this.turn180Degrees();
        return 0;
    }

    void turn180Degrees() {
        kara.turnRight();
        kara.turnRight();
    }
}
