import java.util.Scanner;



class Parent {

	public static void max() {
		System.out.println("This is max parent method");
	}

	public  void max_final() {
		System.out.println("This is max final method parent one");
	}

}

public class CheckingArray extends Parent{


	public static void max() {
		System.out.println("This is max");
	}

	@Override
	public void max_final() {
		System.out.println("This is max final method");
	}


	public static void main(String args[]) {

		Parent c = new CheckingArray();
		c.max();
		c.max_final();
	}
	
}