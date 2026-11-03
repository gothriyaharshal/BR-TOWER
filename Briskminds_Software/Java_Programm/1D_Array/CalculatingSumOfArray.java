import java.util.Scanner;

class CalculatingSumOfArray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Provide Size of Array you want");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
	
		System.out.println("Please Enter your array elements");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}


		for(int i = 0 ; i < arr.length ; i++) {
			sum = sum + arr[i];
		}
		System.out.println("total sum of your array is -> " + sum);
		
	}
} 