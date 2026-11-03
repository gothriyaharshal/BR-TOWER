import java.util.Scanner;

public class asd2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your number");
			
		int  n= sc.nextInt();

		int arr[] = new int[n];

		for(int i  = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
	
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i] ; j++) {
				System.out.print("*");
			}
			System.out.println();
   		}

	}
}