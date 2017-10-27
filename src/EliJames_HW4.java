/*************************************************************************
 * Title: ClassSection/StudentEnrollee Class Test Program
 * File: EliJames_HW4.java
 * Author: James Eli
 * Date: 9/5/2016
 *
 * This is a program that tests the ClassSection and StudentEnrollee 
 * classes. It creates an object of the ClassSection class via it's
 * implicit 9-parameter constructor, and then adds (4) arbitrary students,
 * assigns them arbitrary grades and withdraws a student. The results 
 * are displayed after each student change via the overridden toString() 
 * method.
 *
 * Notes:
 *  (1) Compiled with java SE JDK 8, Update 102 (JDK 8u102).
 *
 * Submitted in partial fulfillment of the requirements of PCC CIS-131.
 *************************************************************************
 * Change Log:
 *   09/5/2016: Initial release. JME
 *************************************************************************/
public class EliJames_HW4 {
	
  /*********************************************************************
   * Start of main program. Command line arguments are ignored.
   *********************************************************************/
  public static void main( String[] args ) {
    try {  
      // Instantiate ClassSection object.
      ClassSection cs = new ClassSection();
      
      // Test setters.
      cs.setCRN( 10001 );
      cs.setDepartmentCode( "ABC" );
      cs.setCourseNumber( 123 );
      cs.setInstructionalMode( "On-ground" );
      cs.setMeetingDays( "T, TH" );
      cs.setMeetingTimes( "2pm-3pm" );
      cs.setCapacity( 50 );
      cs.setEnrollment( 49 );
      cs.setInstructorID( 456 );
      
      // Display results.
      System.out.println( cs );

      // Add 4 arbitrary students to class and display them.
      cs.addStudent( 100 );
      cs.addStudent( 201 );
      cs.addStudent( 302 );
      cs.addStudent( 403 );
      cs.displayStudentsEnrolled();
      
      // Assign arbitrary grades to the 4 students and display them.
      cs.assignStudentGrade( 100, 1 );
      cs.assignStudentGrade( 201, 2 );
      cs.assignStudentGrade( 302, 3 );
      cs.assignStudentGrade( 403, 4 );
      cs.displayStudentsEnrolled();

      // Attempt to locate a student via ID.
      if ( cs.locateStudent( 302 ) != null )
        System.out.println( "Found student:\r\n" + cs.locateStudent( 302 ) );

      // Withdraw a student with ID #302 and display remaining enrolled students.
      cs.withdrawStudent ( 302 );
      cs.displayStudentsEnrolled();

      // Attempt to locate a student via ID.
      if ( cs.locateStudent( 302 ) == null ) 
        System.out.println( "Student ID #302 was not found." );
      
    } catch ( Exception e ) {
      // Display the exception data.
      System.err.println( "Exception: " + e.getMessage() );
    }
      
    // Program terminates here.
      
  } // End of main module.

} // End of EliJames_HW4 class
