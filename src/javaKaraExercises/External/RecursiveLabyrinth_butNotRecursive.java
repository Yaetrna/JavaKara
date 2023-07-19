package javaKaraExercises.External;

import javakara.JavaKaraProgram;

public class RecursiveLabyrinth_butNotRecursive extends JavaKaraProgram {

    public static void main(String[] args) {
        String current_directory = System.getProperty("user.dir");
        String world_file_name = "RecursiveLabyrinth";
        current_directory += "\\src\\worlds\\"+world_file_name+".world";
        System.out.println(current_directory);
        new RecursiveLabyrinth_butNotRecursive().run(current_directory);
    }

}
