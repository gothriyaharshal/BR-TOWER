import java.util.Scanner ;

class TwentyEigthPattern {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Please provide how many row do you want");
		int row = sc.nextInt();

		
		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				if(j == 1 || j == i-1)
					System.out.print(j);
				else if(i == row )
					if(j == row) 
						continue;
					else
						System.out.print(j);
				else
					System.out.print(" ");
			}

			for(int space = 1 ; space <= 2*(row - i)-1 ; space++) {
				System.out.print(" ");
			}

			for(int k = i ; k >= 1 ; k--) {
				if(k == 1 || k == i)
					System.out.print(k);
				else if(i == row )										System.out.print(k);
				else
					System.out.print(" ");
			}

			System.out.println();

		}
	}
}