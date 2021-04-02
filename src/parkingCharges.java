// exercise 6.8
// calculate parking charges
import java.util.Scanner;
public class parkingCharges {
    public static void main( String[] args)
    {
        int hours = 3;
        double calculateCharges = 0;
        Integer charges = 2;
        if ( hours < 3 )
            System.out.println(" hours not up to the least time ");
        if ( hours == 3 )
           calculateCharges = charges * hours;
        if ( hours > 3 )
            calculateCharges = (charges + 0.05) * hours;
        if (hours == 24 )
            calculateCharges = 10;
        System.out.printf( "%d\n", calculateCharges);
    }
}
