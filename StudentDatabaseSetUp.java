/**
 * 
 */
package studentdatabasesystempackage;

import java.util.Scanner;

/**
 * @author Yves-Noel Forbang
 *
 */
public class StudentDatabaseSetUp {
	private String firstName;
	private String lastName;
	private int classLevel;
	private String studentID;
	private static int coursePrice = 500;
	private int balance = 0;
	private String courses;
	private static int id = 1000;
	
	
	/**
	 * Constructor receives the Student's first name, Last name, and class level.
	 */
	public StudentDatabaseSetUp() {
		
		Scanner studentInfo = new Scanner(System.in);
		System.out.println("ENTER FIRST NAME : ");
		this.firstName = studentInfo.nextLine();
		
		System.out.println("\n\nENTER LAST NAME : ");
		this.lastName = studentInfo.nextLine();
		
		System.out.println("\n\nENTER CLASS LEVEL \n FRESHMAN = 1 \n SOPHOMORE = 2 \n JUNIOR = 3 \n SENIOR = 4");
		this.classLevel = studentInfo.nextInt();
		
		createStudentID();
		
	}
	
	
	/**
	 * Method creates a 5-digit id unique to each student (with the first digit being the class level)
	 */
	
	private void createStudentID() {
		
		id++;
		studentID = classLevel + "" + id;
		
	}
	
	
	/**
	 * Method takes in the Student's registered courses and calculates the tuition balance via a do loop
	 */
	public void enroll() {
		
		do {
			System.out.println("ENTER YOUR COURSES" + "\n(PRESS F TO FINISH)\n");
			
			Scanner courseEnrollment = new Scanner(System.in);
			String newCourse = courseEnrollment.nextLine();
			
			if (!newCourse.equals("F")) {
				courses = courses + "\n" + newCourse;
				balance = balance + coursePrice;	
			}
			else {
				break;
			}
		}
		while (1 != 0);
		
		System.out.println("ENROLLED IN: " + courses + "\n\n");
	}
	
	
	/**
	 * Method shows the tuition balance
	 */
	public void viewBalance() {
		System.out.println("YOUR BALANCE IS $" + balance);
	}
	
	
	/**
	 * Method shows balance, asks user to input payments and then returns a final balance.
	 */
	public void payTuition() {
		viewBalance();
		
		Scanner payment = new Scanner(System.in);
		System.out.println("ENTER YOUR PAYMENT = $");
		int tuitionPayment = payment.nextInt();
		
		System.out.println("\nThank you for your payment of $" + tuitionPayment);
		
		balance = balance - tuitionPayment;
		viewBalance();
		System.out.println("\n\n");
		
	}
	
	
	/**
	 * Method returns an amalgamation of all student input, highlighting the student's name, id, courses enrolled, grade year and tuition balance
	 * @return
	 */
	public String showStudentInfo() {
		return "\n\n    STUDENT INFO" + "\nSTUDENT NAME = " + firstName + " " + lastName + "\nSTUDENT ID = " + studentID + "\nGRADE YEAR = " + classLevel + "\nCOURSES ENROLLED:" + "\n " + courses + "\n" + "TUITION BALANCE = " + balance;  
	}

}
