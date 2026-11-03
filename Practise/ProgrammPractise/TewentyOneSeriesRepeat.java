import java.util.Scanner;

class TewentyOneSeriesRepeat {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1 ;
    		int a = 0;
		int b ;
		int count = 1 ;
		int max = 1;

		System.out.println("Provide your integer sir");
		a = sc.nextInt();
		
		while(i < 10) {
			b = sc.nextInt();
			
			if(b > a)
				count++;
			else
				count = 1;
			if(count > max)
				max = count ;		
			a = b;
			i++;
		}

		System.out.println("Max length is  " + max);
	}
}

