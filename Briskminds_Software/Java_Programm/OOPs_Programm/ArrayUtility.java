class ArrayUtility {
	
	public static void sortingArray(int arr[]) {
		for(int i = 0 ; i < arr.length- 1 ; i++) {
			for(int j = 0 ; j < arr.length-i-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static int searchFirstIndex(int number , int arr[]) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == number){
				return i; 
			}
		}
		return 0;
	}
}