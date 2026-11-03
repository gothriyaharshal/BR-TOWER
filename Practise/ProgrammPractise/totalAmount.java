import java.util.Scanner;

class totalAmount {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int discount = 0;
		if(amount >= 1000){
			discount = (int)(amount * .10);
		}
		System.out.println("Final bill is " + (amount-discount));
	}
}