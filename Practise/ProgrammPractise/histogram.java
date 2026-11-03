//horizontal histogram

import java.util.Scanner;

class histogram {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for(int i = 1 ; i <= row ; i++) {
			for(int j = (row/2)+1  ; j >= 1 ; j--) {
				if(j == 1 || j == ( (i <= (row/2)+1) ? i : (row-i)+1)  )
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}