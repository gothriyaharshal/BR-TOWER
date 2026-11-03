/*
 author -> Harshal Gothriya
 Date -> 14/10/2026
*/


import java.util.Scanner;

class CalculatingfinalBill {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide shopping amount");
		double amount = sc.nextInt();

		if(amount>=1000) {
			amount = amount - amount*0.10;
		}
		
                System.out.println("Total amount is - > " + amount);
	}
}