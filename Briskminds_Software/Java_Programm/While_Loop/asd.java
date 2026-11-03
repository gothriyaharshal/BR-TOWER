import java.util.Scanner;

class asd {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();

		int place = 1;
		int binary = 0;
		while(decimal > 0) {
			int rem = decimal % 2;
			binary = binary + place * rem ;
			place = place * 10;
			decimal = decimal / 2;
                }
	System.out.println(binary);
	}	
}