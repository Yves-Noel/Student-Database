/**
 * 
 */
package studentdatabasesystempackage;

import java.util.Scanner;

/**
 * @author ynfor
 *
 */
public class StudentDatabaseMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		/**
		 * Entry asks the user the number of students to be enrolled.
		 */
	    Scanner scan = new Scanner(System.in);
		int numOfStudentsEnrolled = 0;
		System.out.println("HOW MANY STUDENTS DO YOU WANT TO ENROLL: ");
		numOfStudentsEnrolled = scan.nextInt();
		
		/**
		 *  Entry stores each student info in an array called "Students" and prints each student info.
		 */
		StudentDatabaseSetUp[] students = new StudentDatabaseSetUp[numOfStudentsEnrolled];// user input array
		for (int index = 0; index < numOfStudentsEnrolled; index++) {
			students [index] = new StudentDatabaseSetUp();
		    students[index].enroll();
		    students[index].payTuition();
		}
		
		for (int index = 0; index < numOfStudentsEnrolled; index++) {
			System.out.println(students[index].showStudentInfo());
	} 

  }
	
}
