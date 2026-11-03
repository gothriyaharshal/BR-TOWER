//finding greatest out of four

import java.util.Scanner;

class GreatestOutOfFourPractise {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if(a > b)
			if(a > c)
				if(a > d)
					System.out.println("a is greater");
				else
					System.out.println("d is greater");
			else
				if(c > d)
					System.out.println("c is greater");
				else
					System.out.println("d is greater");
		else
			if(b > c)
				if(b > d)
					System.out.println("b is greater");
				else
					System.out.println("d is greater");
			else
				if(c > d)
					System.out.println("c is greater");
				else
					System.out.println("d is greater");				
	}
}