
import java.util.Scanner;

class NineteenthSeries {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		int binary = sc.nextInt();
		int power = 0;
		int decimal = 0;
	
		while(binary > 0) {
			int rem = binary % 10;
			decimal = decimal + (rem * p(power));
			power++;
			binary = binary / 10;
		}
		System.out.println(decimal);
	}	

	public static int p(int power) {
		int answer = 1;

		while(power > 0 ) {
			answer = 2 * answer ;
			power--;
		}
		return answer;
	}

}