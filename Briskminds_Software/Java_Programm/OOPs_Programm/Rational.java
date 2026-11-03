import java.util.Scanner;

class Rational {

	int numerator ;
	int denominator;
	
	Rational(int numerator , int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public void displaying(){
		System.out.print(this.numerator +"/"+ this.denominator);
	}

	//default constructor
	public Rational() {

	}

	public Rational addition(Rational other) {
		//first we finding lcm of both denominator
		Rational  result = new Rational();
 
		result.denominator = findLcm(this.denominator , other.denominator);
		
		result.numerator = ((result.denominator/this.denominator)*this.numerator) + ((result.denominator/other.denominator)*other.numerator);
	
		return result; 
	}

	public Rational substraction(Rational other) {
		//first we finding lcm of both denominator
		Rational  result = new Rational();
 
		result.denominator = findLcm(this.denominator , other.denominator);
		
		result.numerator = ((result.denominator/this.denominator)*this.numerator) - ((result.denominator/other.denominator)*other.numerator);
	
		return result; 
	}

	public static int findGcd(int a , int b) {
		while(b != 0) {
			int remainder = a % b;
			a = b;
			b = remainder;
		}
		return a;
	} 

	 public static int findLcm(int c, int d){
        	return (c * d) / findGcd(c , d);
    	} 
}