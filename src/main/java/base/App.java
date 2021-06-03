package base;

import java.util.Scanner; //import package for scanner used latter

public class App {
    public static void main(String[] args) //main
    {
        //prompt for user input, same line
        System.out.print("What is the quote? ");

        //create scanner for use throughout exercise
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        //prompt for author, same line
        System.out.print("Who said it? ");
        String author = input.nextLine();

        //print output within single statement
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
