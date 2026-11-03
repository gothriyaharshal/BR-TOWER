import java.util.Scanner;

class SortAnArray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide Size of Array you want");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
	
		System.out.println("Please Enter your array elements");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		displayingArray(arr);


		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length - i - 1 ; j++) {
				if(arr[j] > arr[j+1])	{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println();
		displayingArray(arr);

	}

	public static void displayingArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
} 