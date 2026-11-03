import java.util.Scanner;

class PatternSeventeenth {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("provide your row please");
		int row = sc.nextInt();

		for(int i = 1 ; i <=row ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j);
			}
		
			for(int space = 1 ; space <= 2*(row-i)-1 ; space++) {
				System.out.print(" ");
			}

			for(int j = (i == row) ? i-1 : i ; j >= 1 ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}