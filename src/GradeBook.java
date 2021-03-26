// exercise 3.11
// modify GradeBook
public class GradeBook {
    private String courseName; // course name for this GradeBook
    private String instructorName;
    // constructor initializes courseName with String argument
    public GradeBook( String name, String instructor ) // constructor name is class name
    {
        courseName = name; // initializes courseName
        instructorName = instructor;
    } // end constructor
    // method to set the course name
    public void setCourseName( String name, String instructor )
    {
        courseName = name; // store the course name
        instructorName = instructor;
    } // end method setCourseName
    // method to retrieve the course name
    public String getCourseName()
    {
        return courseName;
    } // end method getCourseName
    public String getInstructorName()
    {
        return instructorName;
    } // end method getCourseName
    // display a welcome message to the GradeBook user
    public void displayMessage()
    {
// this statement calls getCourseName to get the
// name of the course this GradeBook represents
        System.out.printf( "Welcome to the grade book for\n%s!\n",
                getCourseName() );
        System.out.printf( "And by \n%s!\n",
                getInstructorName() );

    } // end method displayMessage
} // end class GradeBook
