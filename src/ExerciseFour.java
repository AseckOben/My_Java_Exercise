// exercise 4.17
//using sentinel controlled repetition
import java.util.Scanner;

public class ExerciseFour {
    public void determineMilesPerGallon()
    {
        Scanner input = new Scanner(System.in);
        int miles;
        int gallons;
        int trips;
        int milesPerGallons;
        int totalTrips;
        float averageCalculation;

        miles = 0;
        gallons = 0;
        milesPerGallons = 0;
        totalTrips = 0;
        System.out.print( "Enter Trip or -1 to quit: ");
        trips = input.nextInt();
        while ( trips != -1 ) {
            miles = miles + 1;
            gallons = gallons + 1;
            totalTrips = trips + 1;
            milesPerGallons = miles / gallons;


            System.out.print("Enter miles or -1 to quit: ");
            miles = input.nextInt();
            System.out.print("Enter gallons or -1 to quit: ");
            gallons = input.nextInt();

            System.out.println( milesPerGallons = miles / gallons);
            System.out.println(  averageCalculation = (float) totalTrips / miles);
            }



        }

    }


