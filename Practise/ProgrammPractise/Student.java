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

class Student {

	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Provide how many number of class were held");
		int numclass = sc.nextInt();
		int attendance = (int)(numclass * .75) ;

		System.out.println("Provide how many number of class attended");
		int numclassattended = sc.nextInt();
		int percentageOfNumberOfClassAttended = (numclassattended *100) / numclass ;

		if(numclassattended < attendance) {
			System.out.println("Not to be allowed");
			System.out.println("attendence percentage " + attendance);

			System.out.println("Class attended percentage " + percentageOfNumberOfClassAttended);
		}
		else
			System.out.println("allowed");
System.out.println("attendence percentage " + attendance);

			System.out.println("Class attended percentage " + percentageOfNumberOfClassAttended);
	}
}