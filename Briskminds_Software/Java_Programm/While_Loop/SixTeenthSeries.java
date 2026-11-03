//printing the below series for n times 1 0 1 0 1 0 1 0 1 0

import java.util.Scanner;

import java.util.Scanner;

class SixTeenthSeries {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	int a, b = 0, c = 0, ch = 1;
        	int i = 0;

        while (ch == 1) {
        	System.out.print("Enter number: ");
            	a = sc.nextInt();

            	if (i == 0) {
                	b = a;
                	c = a;
                	i = 1;
            	} 
		else {
                	if (a > b) {
                    		b = a;
                        }
                        if (a < c) {
                		c = a;
                	}
		}
 
        	System.out.print("Please press 1 to continue and 0 to exit");
        	ch = sc.nextInt();
        }

        System.out.println("Largest => " + b);
        System.out.println("Smallest => " + c);
    }
}