import java.util.Scanner;

class greatOutOfThree {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a > b)
			if(a > c)
				System.out.print("A is greater");
			else
				System.out.print("C is greater");
		
		else
			if(b > c)
				System.out.print("b is greater");
			else
				System.out.print("C is greater");
	
	}
}