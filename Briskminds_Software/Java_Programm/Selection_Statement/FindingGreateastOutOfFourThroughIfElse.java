import java.util.Scanner;
class FindingGreateastOutOfFourThroughIfElse {
	public static void main(String args []) {
	Scanner sc = new Scanner(System.in);

		System.out.println("Provide your first number");
		int a = sc.nextInt();

		
		System.out.println("Provide your second number");
		int b = sc.nextInt();

		
		System.out.println("Provide your third number");
		int c = sc.nextInt();

		System.out.println("Provide your fourth number");
		int d = sc.nextInt();	

		if(a > b)
			if(a > c)
				if(a > d)
					System.out.println("A is Greater ");
				else
					System.out.println("D is Greater ");
			else
				if(c > d) 
					System.out.println("C is Greater ");
				else 
					System.out.println("D is Greater ");
		else
			if(b > c ) 
				if(b > d)
					System.out.println("b is Greater ");
				else 
					System.out.println("D is Greater ");
			else	
				if(c > d) 
					System.out.println("C is Greater ");
				else 
					System.out.println("D is Greater ");



	}

}