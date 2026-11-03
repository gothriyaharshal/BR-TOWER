import java.util.Scanner;
import java.util.HashMap;


class Frequency{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your string");

		String str = sc.nextLine();

		HashMap<Character , Integer> hs = frequency(str);

		for (HashMap.Entry<Character, Integer> m : hs.entrySet()) {
            		System.out.println(m.getKey() + " ---- " + m.getValue());
       		}
	}

	public static HashMap<Character , Integer> frequency(String str) {
		
		HashMap<Character , Integer> hs = new HashMap<>();

		char[] arr = str.toCharArray();

		for(int i = 0 ; i < arr.length ; i++) {
			if(hs.containsKey(arr[i])) {
				int temp = hs.get(arr[i]);
				hs.put(arr[i] , temp+1);
			}
			else {
				hs.put(arr[i] , 1);
			}
		}
    		return hs;
	}
}