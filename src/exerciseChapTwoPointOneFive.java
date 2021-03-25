//exercise 2.15
import java.util.Scanner;
public class exerciseChapTwoPointOneFive {
    public static void main( String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        int product;
        int difference;
        int quotient;
        System.out.print( "Enter first number: ");
        number1 = input.nextInt();
        System.out.print( "Enter second number: ");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.printf( "Sum is %d\n", sum );
        product = number1 * number2;
        System.out.printf( "Sum is %d\n", product );
        difference = number1 - number2;
        System.out.printf( "Sum is %d\n", difference );
        quotient = number1 / number2;
        System.out.printf( "Sum is %d\n", quotient );
    }
}
