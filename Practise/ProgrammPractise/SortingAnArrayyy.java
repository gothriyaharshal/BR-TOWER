//8) WAP to sort an Integer Array.

//removing duplicate element from an array

import java.util.Scanner ;

class SortingAnArrayyy {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide your array size");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array before");
		displayingArray(arr);
		
		sortingAnArray(arr);
		
		System.out.println("After Sorting");
		displayingArray(arr);
		
	}

	public static void displayingArray(int arr[]) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + "   " );
		}
	}

	public static void sortingAnArray(int[] arr) {
		for(int i = 0 ; i < arr.length - 1 ; i++) {
			for(int j = 0 ; j < arr.length - i - 1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}