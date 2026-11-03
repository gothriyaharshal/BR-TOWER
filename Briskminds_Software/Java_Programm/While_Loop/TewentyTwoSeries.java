import java.util.Scanner;

class TewentyTwoSeries {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number :");
		
		int a = sc.nextInt();
		int b ;
		int max = 1;
		int count = 1;
		int i =1;
		while(i < 10 ) {
			
			System.out.println("Enter number :");
			
			b = sc.nextInt();

			if(a >= b) {
				if(b == a) {
					count++;
					if(count > max) {
						max = count;
					}
				}
			}
			else {
				count = 1;
				a = b;
			}
			i++;
			
		}

		System.out.println("Maximinum element is " + a);

		
		System.out.println("times of element is " + max);
	}
}