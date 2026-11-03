import java.util.Scanner;

class TestMatrix {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);


		System.out.println("First we are making our first array");

		System.out.println("Please provide your row sir");
		int row = sc.nextInt();

		System.out.println("Please provide your column sir");
		int column = sc.nextInt();

		MatrixClass m1 = new MatrixClass(row , column);
		//displaying the matrix function
		
		m1.displaying();

		System.out.println("Now we are making our second array");

		System.out.println("Please provide your row sir");
		int row2 = sc.nextInt();

		System.out.println("Please provide your column sir");
		int column2 = sc.nextInt();

		MatrixClass m2 = new MatrixClass(row2 , column2);
		//displaying the matrix function
		
		m2.displaying();

		System.out.println("adding both matrix");
		MatrixClass m3 = m1.add(m2);
		
		if(m3 != null) {
		m3.displaying();
		}
		else {
			System.out.println("Your first row or column might be not equal to second matrix row and column");
		}		

		System.out.println("Now we are making the transpose of the matrix");
		MatrixClass m4 = m3.transpose();
		m4.displaying();


		System.out.println("Now we are doing the Multiplication of two matrix");
		MatrixClass m5 = m4.multiplication(m1);
		m5.displaying();
	}
}