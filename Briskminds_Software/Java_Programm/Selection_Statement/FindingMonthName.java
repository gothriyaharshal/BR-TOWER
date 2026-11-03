
import java.util.Scanner;

class FindingMonthName {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);

               System.out.println("Please provide value from 1 to 12");
		String monthName = "";
		int totalDays = 0;
		int Month = sc.nextInt();
		switch(Month) {
			case 1 : 
				monthName = "Jan";
				totalDays = 31 ;
				System.out.println("Your Month name is - > " + monthName);
				System.out.println("Your Total days are in this month -> " + totalDays);
				break;

			case 2 : 
				monthName = "Feb";
				totalDays = 28;
				System.out.println("Your Month name is - > " + monthName);
				System.out.println("Your Total days are in this month -> " + totalDays);
				break;

			case 3 : 
				monthName = "march";
				totalDays = 31;
				System.out.println("Your Month name is - > " + monthName);
				System.out.println("Your Total days are in this month -> " + totalDays);
				break;
			case 4 : 
				monthName = "april";
				totalDays = 30;
				System.out.println("Your Month name is - > " + monthName);
				System.out.println("Your Total days are in this month -> " + totalDays);
				break;
			case 5 : 
				monthName = "may";
				totalDays = 31;
				System.out.println("Your Month name is - > " + monthName);
				System.out.println("Your Total days are in this month -> " + totalDays);
				break;
			case 6 : 
				monthName = "June";
				totalDays = 30;
				System.out.println("Your Month name is - > " + monthName);
				System.out.println("Your Total days are in this month -> " + totalDays);
				break;

			case 7 : 
				monthName = "July";
				totalDays = 31;
				System.out.println("Your Month name is - > " + monthName);
				System.out.println("Your Total days are in this month -> " + totalDays);
				break;
			case 8 : 
				monthName = "august";
				totalDays = 31;
				System.out.println("Your Month name is - > " + monthName);
				System.out.println("Your Total days are in this month -> " + totalDays);
				break;
			case 9 : 
				monthName = "Sept";
				totalDays = 30;
				System.out.println("Your Month name is - > " + monthName);
				System.out.println("Your Total days are in this month -> " + totalDays);
				break;
			case 10 : 
				monthName = "Oct";
				totalDays = 31;
				System.out.println("Your Month name is - > " + monthName);
				System.out.println("Your Total days are in this month -> " + totalDays);
				break;
			case 11 : 
				monthName = "Nov";
				totalDays = 30;
				System.out.println("Your Month name is - > " + monthName);
				System.out.println("Your Total days are in this month -> " + totalDays);
				break;
			case 12 : 
				monthName = "Dec";
				totalDays = 31;
				System.out.println("Your Month name is - > " + monthName);
				System.out.println("Your Total days are in this month -> " + totalDays);
				break;
		}
	}
}
