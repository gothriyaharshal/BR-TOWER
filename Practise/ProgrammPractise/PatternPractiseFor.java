import java.util.Scanner ;

public class PatternPractiseFor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Please provide your row");
		int row = sc.nextInt();

		for(int i = row ;  i >=1 ; i--){
			//first loop
			for(int j = i; j >=1; j--){
				System.out.print(j);
			}
	
			for(int space = 1 ; space <= 2*(row-i)-1;space++) {
				System.out.print(" ");
			}

			for(int k =((i==row ) ? 2: 1 ) ; k <=i; k++){
				System.out.print(k);
			}
			System.out.println();
		}
	}
}