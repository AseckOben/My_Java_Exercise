// exercise 3.11
// modify GradeBookTest
public class GradeBookTest {
    // main method begins program execution
    public static void main( String[] args )
    {
// create GradeBook object
        GradeBook gradeBook1 = new GradeBook(
                "CS101 Introduction to Java Programming", "Mr Nobody" );
        GradeBook gradeBook2 = new GradeBook(
                "CS102 Data Structures in Java", "Mr peter" );
// display initial value of courseName for each GradeBook
        gradeBook1.displayMessage();

        gradeBook2.displayMessage();


    } // end main
}
