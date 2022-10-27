package edu.ggc.itec.AnthonyWallace;


import java.io.File;
import java.util.*;

public class ReadFile {
 ArrayList<Integer> nums = new ArrayList<>();
    private Scanner x;
    public void openFile(){


        try {
            x = new Scanner(new File("Book1.csv"));

        }
        catch (Exception e){
            System.out.println("could not find file");
        }

    }
    public void readFile(){

            String a = x.next();
            String [] sum = a.split(",");

            for (String s: sum
                 ) {
                nums.add(Integer.parseInt(s));
            }
        }

    public void closeFile(){
        x.close();

    }

}
