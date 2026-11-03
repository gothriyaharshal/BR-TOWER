import java.util.Scanner;
class StarPatter {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please provide how many row do you want");

		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++) {

			int v = (i <= n / 2 + 1) ? i : (n - i) + 1;


			for(int j = 1 ; j <= n ; j++) {
				if( j == v || j == (n-v)+1) {
 					System.out.print(v);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}