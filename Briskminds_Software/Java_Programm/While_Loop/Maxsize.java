//WAP to generate 10 Integer value of 10’s digit and find out the maximum length of increasing series.

import java.util.Scanner;

class Maxsize{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please provide your first value");
		int a = sc.nextInt();

		int maxSize = 1;
		System.out.println("Current max size is this" + maxSize);

		int count = 1;
		int i = 1;

	
		while( i <= 9) {
			System.out.println("Please provide your next Value");
			int b = sc.nextInt();
		
			if(a < b) {
				count++;
				a = b;
				if(count > maxSize) {
					maxSize = count;
				}
			}
			else {

				count = 1;
				a = b; 
			}
			System.out.println("Your current max length is " + maxSize);
			i++;
		}
	}
}