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

public class SumLowerMax {
    public static void main(String[] args) {

        ReadFile r = new ReadFile();
        r.openFile();
        r.readFile();
        r.closeFile();
         int sum = 0;
         int mini = Integer.MAX_VALUE;
         int max = Integer.MIN_VALUE;
        for (int i : r.nums
             ) {  sum +=i;

            if(i < mini)
                mini = i;
            if( i > max)
                max = i;


        }

        double Average =  sum / r.nums.size();
        try (PrintWriter p = new PrintWriter(new File("Stats.txt"))) {
           p.println(" The sum of the numbers is:" + sum);
            p.println("  The lowest number is:" + mini);
            p.println(" The highest number is ::" + max);
            p.println(" The average of the numbers is :" + Average );


            System.out.println(" The sum of the numbers is:" + sum);
            System.out.println("  The lowest number is:" + mini);
            System.out.println(" The highest number is ::" + max);
            System.out.println(" The average of the numbers is :" + Average );


        }
        catch (Exception e){
            System.out.println("");
        }

    }
}
