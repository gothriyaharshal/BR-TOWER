import java.util.Scanner;


class Series {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many series you want");
		int series = sc.nextInt();

		
		int currentNumber = 1 ;
		System.out.print(currentNumber);

		int startedOdd = 3;
		while(series > 1) {
		    startedOdd = oddNumberAfterIf(startedOdd);
		    currentNumber = currentNumber + startedOdd ;

		    System.out.print("  "+currentNumber);
		    series--;
		}
	}

	public static int oddNumberAfterIf(int i) {
		return i+2;		
	}
}