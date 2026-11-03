//horizontal histogram
import java.util.Scanner;
class Horizontalhistogram {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide how many digit  you want");

		int totalDigit = sc.nextInt();
		
		int arr[] = new int[totalDigit];

		for(int i  = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 1 ; j <= arr[i] ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}