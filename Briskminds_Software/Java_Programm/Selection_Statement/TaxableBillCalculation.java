import java.util.Scanner;

class TaxableBillCalculation {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);

                System.out.println("Provide your salary sir");
		int salary = sc.nextInt();
		int taxableAmount = 0; 

		if(salary <= 10000) {
			taxableAmount = salary * 0;
		}
		else if(salary <= 20000) {
			taxableAmount = (int)(salary * .10);
		}
		else if(salary <= 30000) {
			taxableAmount = (int)(salary * .20);
		}
		else {
			taxableAmount = (int)(salary * .25);
		}

         	System.out.println("Total bill of user is => " + taxableAmount);
	}
}	