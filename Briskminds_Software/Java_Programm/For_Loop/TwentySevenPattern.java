import java.util.Scanner;
class TwentySevenPattern {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.println("Please provide n (e.g., 5):");
        	int n = sc.nextInt();

		int totalRows = (2*n)- 1; 
		
		for(int i = 1 ; i <= totalRows ; i++) {
			for(int j = 1 ; j <= n ; j++) {

				if( j == i || j == 1 || j == n -(i - n)) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}       	
    }				
}
     
