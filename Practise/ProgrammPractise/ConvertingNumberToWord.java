/*

13) Program to convert a given number of 4 digit into words.
Note: using switch case.

*/

import java.util.Scanner;

class ConvertingNumberToWord {
	public static void main(String args [] ){
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide your 4 digit number");
		int num = sc.nextInt();
	
		int t = num / 1000;
		int h = ( num / 100 ) % 10;
		int tn = (num / 10) % 10 ;
		int unit = num % 10;

		switch(t) {
			case 1 :
				System.out.print("One thousand   ");
				break;
			case 2:
				System.out.print("two thousand   ");
			        break;
			case 3:	
				System.out.print("three thousand   ");
				break;
			case 4:	
				System.out.print("four thousand   ");
				break;
			case 5:
				System.out.print("five thousand   ");
				break;
			case 6:
				System.out.print("six thousand   ");
				break;
			case 7:
				System.out.print("seven thousand   ");
				break;
			case 8:
				System.out.print("eight thousand   ");
				break;
			case 9:
				System.out.print("nine thousand   ");
				break;

       		}
		
		switch(h) {
			case 1 :
				System.out.print("One Hundread   ");
				break;
			case 2:
				System.out.print("two Hundread   ");
				break;
			case 3:	
				System.out.print("three Hundread   ");
				break;
			case 4:	
				System.out.print("four Hundread   ");
				break;
			case 5:
				System.out.print("five Hundread   ");
				break;
			case 6:
				System.out.print("six Hundread   ");
				break;
			case 7:
				System.out.print("seven Hundread   ");
				break;
			case 8:
				System.out.print("eight Hundread   ");
				break;
			case 9:
				System.out.print("nine Hundread   ");
				break;
		}

		switch(tn) {
			
			case 1 :
				switch(unit) {
					case 0 :
						System.out.print("ten   ");
						break;
					case 1:
						System.out.print("Eleven   ");
						break;
					case 2:	
						System.out.print("twelve   ");
						break;
					case 3:	
						System.out.print("thirteen   ");
						break;
					case 4:
						System.out.print("fourteen   ");
						break;
					case 5:  
						System.out.print("fifteen   ");
						break;
					case 6:
						System.out.print("sixtenn   ");
						break;
					case 7:
						System.out.print("seventeen   ");
						break;
					case 8:
						System.out.print("eighteen   ");
						break;
					case 9:
						System.out.print("nineteen   ");
						break;
				}
			case 2:
				System.out.print("Twenty   ");
				break;
			case 3:
				System.out.print("Thirty   ");
				break;
			case 4:	
				System.out.print("Fourty   ");
				break;
			case 5:	
				System.out.print("Fifty   ");
				break;
			case 6:
				System.out.print("Sixty   ");
				break;
			case 7:
				System.out.print("Seventy   ");
				break;
			case 8:
				System.out.print("Eigthy   ");
				break;
			case 9:
				System.out.print("Ninty   ");
				break;
       		}


		if (tn != 1) {
        		switch(unit){
            			case 1:
					System.out.print("One");
				 	break;
                		case 2: 
					System.out.print("Two");
					break;
                		case 3: 
					System.out.print("Three");
					break;
                		case 4: 	
					System.out.print("Four"); 
					break;
               	 		case 5: 
					System.out.print("Five"); 
					break;
                		case 6: 
					System.out.print("Six"); 
					break;
                		case 7: 
					System.out.print("Seven"); 
					break;
                		case 8: 
					System.out.print("Eight"); 
					break;
                		case 9: 
					System.out.print("Nine"); 
					break;
            		}
	      }				
	}
}