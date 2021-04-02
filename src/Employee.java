public abstract class Employee {
    // Fig. 10.4: Employee.java
// Employee abstract superclass.

        private String firstName;
        private String lastName;
        private String socialSecurityNumber;
        private String Date;
        // three-argument constructor
        public Employee( String first, String last, String ssn, String birthDay )
        {
            firstName = first;
            lastName = last;
            socialSecurityNumber = ssn;
            Date = birthDay;
        } // end three-argument Employee constructor
        // set first name
        public void setFirstName( String first )
        {
            firstName = first; // should validate
        } // end method setFirstName
        // return first name
        public String getFirstName()
        {
            return firstName;
        } // end method getFirstName
        // set last name
        public void setLastName( String last )
        {
            lastName = last; // should validate
        } // end method setLastName
        // return last name
        public String getLastName()
        {
            return lastName;
        } // end method getLastName
        // set social security number
        public void setSocialSecurityNumber( String ssn )
        {
            socialSecurityNumber = ssn; // should validate
        }// end method setSocialSecurityNumber
        // return social security number
        public String getSocialSecurityNumber()
        {
            return socialSecurityNumber;
        } // end method getSocialSecurityNumber
        public String getDate()
        {
            return Date;
        }
        // return String representation of Employee object
        @Override
        public String toString()
        {
            return String.format( "%s %s\nsocial security number: %s",
                    getFirstName(), getLastName(), getSocialSecurityNumber() );
        } // end method toString
        // abstract method overridden by concrete subclasses
        public abstract double earnings(); // no implementation here

}
