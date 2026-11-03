//inserting element into an existing array


import java.util.Scanner;

class InsertingElement {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide your array size");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}

		displayingArray(arr);

		System.out.println("Please provide which element you want to insert");
		int element = sc.nextInt();

		System.out.println("Please provide in which position do you want to print this element");
		int position = sc.nextInt();


		if(position > 0 && position < arr.length) {
		       int arr2[] = insertingElement(arr, element , position);	
		       displayingArray(arr2);
		}
		else {
			return;
		}		
	}


	public static void displayingArray(int arr[]) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + "   " );
		}
	}
	public static int[] insertingElement(int arr[] , int element , int position) {
		
		int arr2[] = new int[arr.length + 1];

		//first part
		for(int i = 0 ; i < position ; i++) {
			arr2[i] = arr[i]; 
		}

		arr2[position] = element;

		for(int j = position + 1 ; j < arr2.length ; j++) {
			arr2[j] = arr[j-1];
		}
	        return arr2;
	}
}