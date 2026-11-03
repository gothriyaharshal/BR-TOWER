import java.util.Scanner;


class WhileLoop {
	public static void main(String args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide which number fact do you want");

		int number = sc.nextInt();
		int fact = 1;
		while(number >= 1) {
			fact = fact * number ;
			number--;
		}
		System.out.println("Your fact is " + fact);
  	}
}