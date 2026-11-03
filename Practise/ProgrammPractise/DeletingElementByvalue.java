//inserting element into an existing array


import java.util.Scanner;

class DeletingElementByvalue {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide your array size");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}

		displayingArray(arr);


		System.out.println("please proide which element do you want to delete");
		int element = sc.nextInt();

		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == element) {
				arr = deletingElement(arr , i);	
			}
		}

	       displayingArray(arr);

	}

	public static void displayingArray(int arr[]) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + "   " );
		}
	}
	public static int[] deletingElement(int arr[] , int position) {
		
		int arr2[] = new int[arr.length - 1];

		//first part
		for(int i = 0 ; i < position ; i++) {
			arr2[i] = arr[i]; 
		}

		for(int j = position + 1 ; j < arr.length ; j++) {
			arr2[j - 1] = arr[j];
		}
	        return arr2;
	}
}