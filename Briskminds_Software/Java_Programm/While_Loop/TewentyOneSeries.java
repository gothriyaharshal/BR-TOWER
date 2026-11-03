import java.util.Scanner;

class TewentyOneSeries {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1 ;
    		int pre = 0;
		int curr ;
		int count = 1 ;
		int max = 1;

		System.out.println("Provide your integer sir");
		pre = sc.nextInt();
		
		while(i < 10) {
			curr = sc.nextInt();
			
			if(curr > pre)
				count++;
			else
				count = 1 ;
			if(count > max) 
			max = count ;
			pre = curr ;
			i++;
		System.out.println("Maximum length is => " + max);
		}
	}		
}