/*
12) A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
*/
 
import java.util.Scanner;

class AttendenceCalculation {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Provide How many total Classes held in session");
		int totalClassHeld = sc.nextInt();
		System.out.println("Total class held" + totalClassHeld);

		System.out.println("Please Provide How many total Classes student were attend");
		int numberOfClassesAttend = sc.nextInt();
		System.out.println("Total number of class attend by user is " + numberOfClassesAttend);

//finding the 75% of totalClassheld

                float attendancePercentage = (numberOfClassesAttend/totalClassHeld) * 100; 	
                float SeventyFivePercentageRule = (float)(totalClassHeld*0.75);
		
		if(numberOfClassesAttend < SeventyFivePercentageRule) {
			System.out.println("not allowed.");
		}
		else {
			System.out.println("allowed");
		}
	}
}