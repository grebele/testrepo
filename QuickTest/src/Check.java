
public class Check {

	public static void main(String[] args) {
	int x = 0;
	int y = 10;
	//unchecked Exception -> RuntimeException
	
	try {
	int z = y/x;
	System.out.println(z);
	}
	catch (ArithmeticException ex) {
		System.out.println("Division mit Null ist nicht möglich");
		System.err.println("Division mit Null ist nicht möglich");
	}
	
	}
}