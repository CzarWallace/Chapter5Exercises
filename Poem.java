import java.io.File;
import java.util.Scanner;

/**
    *Using the class Poem below. Write a complete Java program that creates three
     *different objects of type Poem. The
     * program shall then open a text file named poems.txt for writing
     * and write the information about each poem to the
     *text file. The program shall NOT write the toString()
      *version of the object to the file, but write first the poem name
      *on a line and then the poet name on a second line for each poem.
       */


public class Poem {
    private String name;
    private String poet;

    /**
     * no-arg constructor
     */
    public Poem() {
// initialize attributes
        name = "unknown";
        poet = "unknown";
    }

    Scanner t;
    public void openFile(){
        try {


          t = new Scanner(new File("Poems.txt"));

        }
        catch (Exception e){
            System.out.println(" Can't find file");
        }
    }

    public void readFile(){
        String a = t.next();
        String b = t.next();
        String c = t.next();
        String d = t.next();
        String e = t.next();
        String f = t.next();
        String g = t.next();
        String h = t.next();
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the poet
     */
    public String getPoet() {
        return poet;
    }

    /**
     * @param poet the poet to set
     */
    public void setPoet(String poet) {
        this.poet = poet;
    }

    @Override
    public String toString() {
        return "Poem [name=" + name + ", poet=" + poet + "]";
    }
}