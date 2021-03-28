// exercise 7.14
// variable length argument list

public class ArrayProduct {
    Integer product = 0;
    public static Integer product( Integer A1, Integer A2, Integer A3 )
    {
        Integer product = A1 * A2 * A3;
        return product;

    }
    public static void main( String[] args)
    {
        Integer A1 = 20;
        Integer A2 = 10;
        Integer A3 = 30;
        System.out.printf( "A1 = %d\nA2 = %d\nA3 = %d\n\n",
                A1, A2, A3);
        System.out.printf( "Product of A1 , A2 and A3 is %d\n",
                product( A1, A2, A3 ) );

    }

}
