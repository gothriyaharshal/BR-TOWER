/*
asd5

1
12
1 3
1  4
1   5
1  4
1 3
12
1
*/

import java.util.Scanner;

class asd5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		for(int i = 1 ; i <= row ; i++) {
			for(int j = (row/2)+1 ; j >= 1  ; j--) {
				if( j == 1 ||  j == ( ( i <= ((row/2)+1) ) ? i : ((row - i)+1) ) ){										System.out.print(j);
				}
				else {
					System.out.print(" ");
				}	

			}
			System.out.println();
		}
	}
}