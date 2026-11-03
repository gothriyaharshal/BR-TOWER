import java.util.Scanner;

class FindingGreatestAndLargest {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		int a ;
		int b = 0;
		int c = 0;
		int i = 0;
		int ch = 1;

		while(ch == 1 ) {
			System.out.print("Enter number: ");		
			a = sc.nextInt();

			if(i == 0) {
				b = a;
				c = a;
				i = 1;
			}
			
			else {

				if(a > b)
					b = a;
				if(a < c)
					c = a;	
			}

			System.out.println("Do you want to print more number if yes then print 1 or if not then print 0");
			ch = sc.nextInt();
		}
		 System.out.println("Largest => " + b);
	        System.out.println("Smallest => " + c);

	}
}


