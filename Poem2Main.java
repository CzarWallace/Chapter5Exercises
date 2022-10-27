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

public class Poem2Main {

    public static void main(String[] args) {

        ReadFile r = new ReadFile();
        r.openFile();
        r.readFile();
        r.closeFile();


        try (PrintWriter p = new PrintWriter(new File("Poems2.txt"))) {
            p.println(" We Real Cool:Gwendolyn Brooks");
            p.println(" I Know Why the Caged Bird Sings: Maya Angelou:" );
            p.println("  Hope is the Thing with Feathers: Emily Dickinso:");
            p.println(" The Road Not Taken:Robert Frost " );


            System.out.println(" We Real Cool:Gwendolyn Brooks");
            System.out.println(" I Know Why the Caged Bird Sings: Maya Angelou:" );
            System.out.println("  Hope is the Thing with Feathers: Emily Dickinso:");
            System.out.println(" The Road Not Taken:Robert Frost " );



        }
        catch (Exception e){
            System.out.println("");
        }



    }
}
