// Exercise 2.3
// chapter 2
import java.util.Scanner;
public class java_chapterTwoExercisefive {
// starting main method of java application
    public static void main ( String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x;// first variable
        int y;// second variable
        int z;// third variable
        int product; // declare the product
        System.out.print( "Enter first integer: "); // prompt
        x =input.nextInt(); //read first integer
        System.out.print( "Enter second integer:  "); // prompt
        y= input.nextInt(); // read second integer
        System.out.print( "Enter third integer:  "); // prompt
        z=input.nextInt(); // read third integer
        product = x * y * z; // the product of three numbers
        System.out.printf( "product is %d\n ", product);


    }
}
