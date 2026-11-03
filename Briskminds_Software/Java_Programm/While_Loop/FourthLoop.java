//printing the below series for n times 1 0 1 0 1 0 1 0 1 0

import java.util.Scanner;

class FourthLoop {
	public static void main(String args [] ) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide how many times you want this series");

		int n = sc.nextInt();
		
		while(n != 0) {
			if(n % 2 == 0)
				System.out.print(0 + " ");
			else
				System.out.print(1 + " ");
			n--;
          	}
	}
}