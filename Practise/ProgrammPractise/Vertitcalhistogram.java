//Vertical histogram
import java.util.Scanner;
class Vertitcalhistogram {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide how many digit  you want");

		int totalDigit = sc.nextInt();
		
		int arr[] = new int[totalDigit];

		for(int i  = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		//2195
		//finding max digit from arr
		int row = findingMax(arr);
		int max = row;

		for(int i = 0 ; i < row ; i++ ) {
			for(int j = 0 ; j < arr.length ; j++) {
				if(arr[j] >= max) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			max--;
		}		
	}

	public static int findingMax(int arr[]) {
		int m = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > m) {
				m = arr[i];
			}
		}
		return m;
	}
}