import java.util.Scanner ;

class EigthteenthPattern {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Please provide how many row do you want");
		int row = sc.nextInt();

		
		for(int i = row ; i >= 1 ; i--) {
			for(int j = i ; j >= 1 ; j--) {
				System.out.print(j);
			}

			for(int space = 1 ; space <= 2*(row - i)-1 ; space++) {
				System.out.print(" ");
			}

			for(int k = 1 ; k <= i ; k++) {
				if( k == 1 && i == row)
					continue;
				else
					System.out.print(k);
			}

			System.out.println();

		}
	}
}