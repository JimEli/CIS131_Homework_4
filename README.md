# Pima CC CIS131 Homework Assignment #4

ClassSection/StudentEnrollee Class Test Program
File: EliJames_HW4.java

This is a program that tests the ClassSection and StudentEnrollee classes. It creates an object of the ClassSection class via it's implicit 9-parameter constructor, and then adds (4) arbitrary students, assigns them arbitrary grades and withdraws a student. The results are displayed after each student change via the overridden toString() method.

*File: ClassSection.java

This is a ClassSection class for the PIMA Community College that includes instance fields for CRN, Department Code, Course Number, 
Instructional Mode, Meeting Days, Meeting Times, Capacity, Enrollment, and Instructor ID. 
* The fields are all defined as private. 
* The class includes accessors and mutators for all of the fields. 
* Extensive input validation is performed to assure the fields are in an acceptable format and range. 
* This class implements serialization, and overrides the toString(), equals() and hashCode() methods.  

*File: StudentEnrollee.java

This is a PIMA Community College Student Enrollee class that includes instance fields for ID and grade. 
* The fields are all defined as private. 
* The class includes accessors and mutators for all of the fields. 
* Extensive input validation is performed to assure the fields are in an acceptable format and range. 
* This class implements serialization, and overrides the toString method().  

Additional Notes:
* Uses StringBuilder, so not multithreaded safe.
* Compiled with java SE JDK 8, Update 102 (JDK 8u102).

Submitted in partial fulfillment of the requirements of PCC CIS-131.
