/*
13) Print the below series!
6, 12, 21, 33, 48.......n-time

*/




import java.util.Scanner;

class ThirteenthSeries {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide till how many times you want this series");
		int range = sc.nextInt();
		
		System.out.println("Please provide from which number you want to start enter 3" );
		int total = sc.nextInt();
		int times = 1;
		while(range >= 1) {

			total = total + multipleOfThree(times);
			times++;	
			System.out.print(total + " ");
			range--;	 
		}
	}

	public static int multipleOfThree(int times) {
	
                return 3*times;
        }
}