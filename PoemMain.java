package edu.ggc.itec.AnthonyWallace;

/**
 * Class: Itec 2150
 * Course: Intermediate programming
 * @version: 0.1
 * @Author Anthony Wallace
 * Written: October 25,2022
 *
 */

import java.io.File;
import java.io.PrintWriter;

public class PoemMain {
    public static void main(String[] args) {

        ReadFile r = new ReadFile();
        r.openFile();
        r.readFile();
        r.closeFile();


        try (PrintWriter p = new PrintWriter(new File("Poems.txt"))) {
            p.println(" We Real Cool:");
            p.println("  Gwendolyn Brooks");
            p.println(" I Know Why the Caged Bird Sings:" );
            p.println(" Maya Angelou :"  );
            p.println("  Hope is the Thing with Feathers:");
            p.println("   Emily Dickinson");
            p.println(" The Road Not Taken:" );
            p.println(" Robert Frost :"  );
            System.out.println();
        }
        catch (Exception e){
            System.out.println("");

        }

    }
}
