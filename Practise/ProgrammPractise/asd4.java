/*
asd4
1       1	
12     21
123   321
1234 4321
123454321

*/
import java.util.Scanner;

public class asd4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();

		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j);
			}

			for(int space = 1 ; space <= 2*(row-i) -1 ; space++) {
				System.out.print(" ");
			}

			for(int k = (i < row) ? i : i-1 ; k >= 1 ; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}