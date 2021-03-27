// exercise 6.23
// Find the minimum of 3 numbers
import java.util.Scanner;
public class Minimum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "Enter three number separated by spaces: " );

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();

        double result = minimum( firstNumber, secondNumber, thirdNumber );
        System.out.println( "Minimum is: " + result );

    }
    public static double minimum( double x, double y, double z )
    {
        return Math.min( x, Math.min( y, z ) );
    }

}