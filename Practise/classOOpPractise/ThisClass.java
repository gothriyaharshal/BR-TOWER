import java.util.Scanner ;

public class ThisClass {

	public void normalMethod() {
		this.callingMethod();
		System.out.println("Normal Method");	
	}
		
	public void callingMethod(){
		System.out.println("We call this method by this keyword");
	}

	public static void main(String args[]) {
		ThisClass t = new ThisClass();
		t.normalMethod();
		
	}
}