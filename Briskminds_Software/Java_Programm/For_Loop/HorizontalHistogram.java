import java.util.Scanner;

class HorizontalHistogram {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please provide how many digit you sir");
		
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Please write down your digit sir");
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		} 

		int row = arr.length;

		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < arr[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
}