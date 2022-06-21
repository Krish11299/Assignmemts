package Exception_Handling;

class UnsupportedOperationException extends Exception{
	public UnsupportedOperationException(String message) {
		super(message);
	}
	public UnsupportedOperationException() {
		super("Number cannot be divided by zero");
	}
}
public class ArithmeticException1 {
    public static void main(String[] args) {
    	int a=100,b=0;
    	int c;
	try {
		 c=(a/b);
	} 
	catch (ArithmeticException e) {
		System.out.println("Invalid operation");
	}
  }
}
