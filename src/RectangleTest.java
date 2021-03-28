// exercise 8.4
// the test program of class Rectangle
import java.util.Scanner;
public class RectangleTest {
    public static void main( String[] args)
    {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        Scanner input = new Scanner(System.in);
        float length;
        float width;

        System.out.print( "Enter length: " );
        length = input.nextFloat();
        System.out.printf( "%.1f\n\n",
                length);
        rectangle1.setLength( length );
        System.out.print( "Enter width: " );
        width = input.nextFloat();
        System.out.printf( "%.1f\n\n",
                width);
        rectangle2.setWidth( width );
        float perimeter = ((length + width )* 2);
        System.out.printf( "Perimeter is %.1f\n\n",
                perimeter);
        float area = (length * width);
        System.out.printf( "Area is %.1f\n\n",
                area);
    }
}
