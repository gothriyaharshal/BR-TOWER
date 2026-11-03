

import java.util.Scanner;

class FourtheenthSeries {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide how many series you want");
		int series = sc.nextInt();

		int a = 0;
			System.out.print(a + " ");
		int b = 1;
			System.out.print(b + " ");
		int c = 0;
		while(series > 2) {
			c = a+b;
			System.out.print(c + " ");
			a = b;
			b = c;
			series--;
		}
	}
}        