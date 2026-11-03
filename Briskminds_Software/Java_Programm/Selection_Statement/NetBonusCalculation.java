/*
 author -> Harshal Gothriya
 Date -> 14/10/2026
*/


import java.util.Scanner;

class NetBonusCalculation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your salary");
		int salary = sc.nextInt();

		System.out.println("Please provide your year of service");
		int year = sc.nextInt();
		
		int netbonus = 0;
		if(year > 5) {
			int bonus = (int)(salary * .05) ;
			netbonus = salary + bonus;
			System.out.println("Your net bonus is"  + netbonus);
		}
		else
			System.out.println("Please finish your 5 year in this company");

	}
}	