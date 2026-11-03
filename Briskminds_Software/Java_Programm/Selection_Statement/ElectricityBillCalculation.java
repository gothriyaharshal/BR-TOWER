
import java.util.Scanner;

class ElectricityBillCalculation {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);

                System.out.println("Provide your unit sir");
		int unit = sc.nextInt();
		int defaultBill = 500;
		int totalBill ; 

		if(unit <= 100) {
			unit = unit * 0;
		}
		else if(unit <= 200) {
			unit = unit * 1;
		}
		else if(unit <= 300) {
			unit = unit * 2;
		}
		else {
			unit = unit * 3;
		}

                totalBill = defaultBill + unit;
		System.out.println("Total bill of user is => " + totalBill);
	}
}	