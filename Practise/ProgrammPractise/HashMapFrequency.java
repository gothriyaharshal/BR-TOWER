import java.util.Scanner;
import java.util.HashMap;
class HashMapFrequency {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Please provide your String");
		String str = sc.nextLine();

		//converting string into charcter
		char[] arr = str.toCharArray();

		HashMap<Character , Integer> h = new HashMap<>();

		for(int i = 0 ; i < arr.length ; i++) {
			if(h.contain(arr[i])) {
				h.add(arr[i] , arr[i].get + 1);
			}
			else
				h.add(arr[i] , 1);
		}

		//displaying HashMap 

		for(HashMap.Entry<Character,Integer> entry : h.entrySet()) {
			System.out.println(entry.get(arr[i]) + " " + entry.getValue(arr[i]));
		}
	}
}