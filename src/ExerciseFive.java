// Exercise 5.29
// The twelve days of christmas lyrics using switch
import java.util.Scanner;
public class ExerciseFive {

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int Days = 1; // initialize counter
        do
        {
                    switch(Days){
                        case 1:
                            System.out.print( "  On the first day of Christmas my true love gave me" +
                                    "a partridge in a pear tree\n");
                            break;
                        case 2:
                            System.out.print("  On the second of Christmas my true love gave me " +
                                    " Two turtle doves and a partridge in a pear tree\n ");
                            break;
                        case 3:
                            System.out.print( " On the third day of Christmas my true love gave to me" +
                                    " Three French hens, Two turtle doves and a partridge in a pear tree\n");
                            break;
                        case 4:
                            System.out.print( "  On the fourth day of Christmas my true love gave to me" +
                                    " Four calling birds Three French hens, Two turtle doves and a partridge in a pear tree\n ");
                            break;
                        case 5:
                            System.out.print( " On the fifth day of Christmas my true love gave to me " +
                                    " Five gold rings Four calling birds Three French hens, Two turtle doves and a partridge in a pear tree\n ");
                            break;
                        case 6:
                            System.out.print( " On the sixth day of Christmas my true love gave to me " +
                                    " Six geese a laying, Five gold rings Four calling birds Three French hens, Two turtle doves and a partridge in a pear tree\n ");
                            break;
                        case 7:
                            System.out.print( " On the seventh day of Christmas my true love gave to me " +
                                    " Seven swans a swimming, Six geese a laying, Five gold rings Four calling birds Three French hens, Two turtle doves and a partridge in a pear tree\n ");
                            break;
                        case 8:
                            System.out.print( " On the eighth day of Christmas my true love gave to me " +
                                    " Eight maids a milky, Seven swans a swimming, Six geese a laying,Five gold rings Four calling birds Three French hens, Two turtle doves and a partridge in a pear tree\n ");
                            break;
                        case 9:
                            System.out.print( " On the ninth day of Christmas my true love gave to me " +
                                    " Nine ladies dancing, Eight maids a milky, Seven swans a swimming, Six geese a laying Five gold rings Four calling birds Three French hens, Two turtle doves and a partridge in a pear tree\n ");
                            break;
                        case 10:
                            System.out.print( " On the tenth day of Christmas my true love gave to me " +
                                    " Ten Lords a leaping, Nine ladies dancing, Eight maids a milky, Seven swans a swimming, Six geese a laying, Five gold rings Four calling birds Three French hens, Two turtle doves and a partridge in a pear tree\n ");
                            break;
                        case 11:
                            System.out.print( " On the eleventh day of Christmas my true love gave to me " +
                                    " Eleven pipers piping, Ten Lords a leaping, Nine ladies dancing, Eight maids a milky, Seven swans a swimming, Six geese a laying, Five gold rings Four calling birds Three French hens, Two turtle doves and a partridge in a pear tree\n ");
                            break;
                        case 12:

                            System.out.print( " On the twelfth day of Christmas my true love gave to me " +
                                    " Twelve drummers drumming,Eleven pipers piping, Ten Lords a leaping, Nine ladies dancing, Eight maids a milky, Seven swans a swimming, Six geese a laying,  Five gold rings Four calling birds Three French hens, Two turtle doves and a partridge in a pear tree\n\n ");
                            break;
                    }



            Days++;
        } while ( Days <= 12 );


        }


        }


