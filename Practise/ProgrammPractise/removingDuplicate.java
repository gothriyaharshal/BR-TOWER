//removing duplicate element from an array

import java.util.Scanner ;

class removingDuplicate {
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
		
		for(int i = 0  ; i < n ; i++) {
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
		System.out.println("Array after");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i] + "   " );
		}

		
	}

	public static void displayingArray(int arr[]) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + "   " );
		}
	}

	
}