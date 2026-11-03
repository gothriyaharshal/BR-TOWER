//finding third largest number out of four through if else ladder

import java.util.Scanner ;

public class asd2 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your four numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();


		if(a > b)
			if(a > c)
				if(a > d) 
					System.out.println("D is greater");
				else
					System.out.println("A is greater");

			else
				if(c > d)
					System.out.println("D is greater");
				else
					System.out.println("C is greater");
		else
			if(b > c)
				if(b > d) 
					System.out.println("D is greater");
				else
					System.out.println("B is greater");

			else	
				if(c > d)
					System.out.println("D is greater");
				else
					System.out.println("C is greater");
	
	}
}