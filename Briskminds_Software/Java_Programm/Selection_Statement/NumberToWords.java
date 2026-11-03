import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int t = n / 1000;
        int h = (n / 100) % 10;
        int tn = (n / 10) % 10;
        int u = n % 10;

        switch (t) {
        	case 1:
			System.out.print("One Thousand ");
		 	break;
         	case 2:
			System.out.print("Two Thousand "); 
		 	break;
        	case 3:
			System.out.print("Three Thousand ");
			break;
            	case 4: 	
			System.out.print("Four Thousand "); 
			break;
            	case 5: 	
			System.out.print("Five Thousand "); 
			break;
            	case 6: 
			System.out.print("Six Thousand "); 
			break;
            	case 7: 
			System.out.print("Seven Thousand "); 
			break;
            	case 8:
			System.out.print("Eight Thousand "); 
			break;
            	case 9:
			System.out.print("Nine Thousand ");
			break;
        }

        switch (h) {
        	case 1: 
			System.out.print("One Hundred "); 
			break;
            	case 2: 
			System.out.print("Two Hundred "); 
			break;
            	case 3: 	
			System.out.print("Three Hundred "); 
			break;
            	case 4: 
			System.out.print("Four Hundred "); 
			break;
            	case 5: 	
			System.out.print("Five Hundred "); 
			break;
            	case 6: 
			System.out.print("Six Hundred "); 
			break;
            	case 7: 
			System.out.print("Seven Hundred ");
			break;
            	case 8: 
			System.out.print("Eight Hundred "); 
			break;
            	case 9: 
			System.out.print("Nine Hundred "); 
			break;
        }

        switch (tn) {
            case 1:
                switch (u) {
                	case 0: 
				System.out.print("Ten"); 
				break;
                	case 1: 
				System.out.print("Eleven"); 
				break;
                    	case 2: 
				System.out.print("Twelve"); 
				break;
                    	case 3: 
				System.out.print("Thirteen"); 
				break;
                    	case 4: 
				System.out.print("Fourteen"); 
				break;
                    	case 5: 
				System.out.print("Fifteen"); 
				break;
                    	case 6: 
				System.out.print("Sixteen"); 
				break;
                    	case 7: 
				System.out.print("Seventeen"); 
				break;
                    	case 8: 
				System.out.print("Eighteen"); 
				break;
                    	case 9: 
				System.out.print("Nineteen"); 
				break;
                }
                break;

            case 2: 
	    	System.out.print("Twenty "); 
		break;
            case 3: 
		System.out.print("Thirty ");
	 	break;
            case 4:
		System.out.print("Forty "); 
		break;
            case 5: 
		System.out.print("Fifty "); 
		break;
            case 6: 
		System.out.print("Sixty "); 
		break;
            case 7: 
		System.out.print("Seventy "); 
		break;
            case 8: 	
		System.out.print("Eighty "); 
		break;
            case 9: 
		System.out.print("Ninety "); 
		break;
        }

        if (tn != 1) {
        	switch (u) {
            		case 1: System.out.print("One"); break;
                	case 2: System.out.print("Two"); break;
                	case 3: System.out.print("Three"); break;
                	case 4: System.out.print("Four"); break;
               	 	case 5: System.out.print("Five"); break;
                	case 6: System.out.print("Six"); break;
                	case 7: System.out.print("Seven"); break;
                	case 8: System.out.print("Eight"); break;
                	case 9: System.out.print("Nine"); break;
            }
        }
    }
}