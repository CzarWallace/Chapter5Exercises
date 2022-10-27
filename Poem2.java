import java.io.File;
import java.util.Scanner;

/** Using the Poem class given in exercise 2, write a Java program to
 * read from a text file named poem2.txt provided
 * below. The program shall read the name and poet of each poem,
 * create an object of type Poem for each name/poet
 * pair and print all the read poem infor to the console.
  */
public class Poem2 {
    private String name;
    private String poet;


    Scanner p2;
    public void openFile(){
        try {


            p2 = new Scanner(new File("Poems2.txt"));

        }
        catch (Exception e){
            System.out.println(" Can't find file");
        }
    }

    public void readFile(){
        String a = p2.next();
        String b = p2.next();
        String c = p2.next();
        String d = p2.next();
        String e = p2.next();
        String f = p2.next();
        String g = p2.next();
        String h = p2.next();
    }


    public Poem2() {
// initialize attributes
        name = "unknown";
        poet = "unknown";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPoet() {
        return poet;
    }

    public void setPoet(String poet) {
        this.poet = poet;
    }

    @Override
    public String toString() {
        return "Poem [name=" + name + ", poet=" + poet + "]";
    }
}