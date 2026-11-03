/*

10) Merge Two Ordered List (duplicacy not allowed)
- Input two Array
- Create a separate function to sort both Array
- Create a separate function to merge both array
- Remove duplicate element from 3rd Array

*/


import java.util.Scanner;

class MergeTwoOrderedList {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide Size of your first Array");
		
		int size = sc.nextInt();
		int arr1[] = new int[size];
	
		System.out.println("Please Enter your first array elements");
		for(int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = sc.nextInt();
		}


		System.out.println("Provide Size of your Second Array");
		
		int size2 = sc.nextInt();
		int arr2[] = new int[size2];
	
		System.out.println("Please Enter your first array elements");
		for(int i = 0 ; i < arr2.length ; i++) {
			arr2[i] = sc.nextInt();
		}

		sortingArray(arr1);
		sortingArray(arr2);
		
		System.out.println("After merging array looks like --- >");
		int arr3[] = mergingBothSortedArray(arr1  , arr2);
		displayingArray(arr3 , arr3.length);

		//removing duplicate element from an array then
		System.out.println("After removing duplicate element result array is --- >");
		int resultArrayLength = removingDuplicate(arr3);
		displayingArray(arr3 , resultArrayLength);
	}

	public static void sortingArray(int arr[]) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length - i - 1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}	
	}

	public static void displayingArray(int[] arr , int length) {
		for(int i = 0 ; i < length ; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static int[] mergingBothSortedArray(int arr1[] , int arr2[]) {

		int n1 = arr1.length;
		int n2 = arr2.length;

		int n = n1 + n2 ;
		int newArr[] = new int[n];

		int i = 0;
		int j = 0;
		int k = 0;

		while(i<n1 && j<n2) {
			if(arr1[i] < arr2[j]) {
				newArr[k] = arr1[i];
				k++;
				i++;
			}
			else {
				newArr[k] = arr2[j];
				k++;
				j++;
			}
		}
		
		
		while(i < n1) {
			newArr[k] = arr1[i];
			k++;
			i++;
		}
		
		while(j < n2) {
			newArr[k] = arr2[j];
			k++;
			j++;
		}
	return newArr;
	}

	public static int removingDuplicate(int arr[]) {

		int n = arr.length;
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = i+1 ; j < n ; j++) {
				if(arr[i] == arr[j]) {
					for(int k = j ; k < n-1 ; k++) {
						arr[k] = arr[k+1];
					}

					n--;
					j--;
				}
			}	
		}
		return n;
	}
} 




