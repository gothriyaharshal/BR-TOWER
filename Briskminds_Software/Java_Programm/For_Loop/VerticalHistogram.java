import java.util.Scanner;

class VerticalHistogram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your number");
			
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i  = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int i  = 0 ; i < arr.length ; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		int temp = max ;

		for(int i = 0 ; i < temp ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(arr[j] >= max)
					System.out.print("*");
				else
					System.out.print(" ");	
			}
			System.out.println();	
			max--;
		}

	}	
}