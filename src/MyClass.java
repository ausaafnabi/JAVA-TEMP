import static java.lang.System.out;

class MyClassException extends Exception{
	public MyClassException() {

	}
	public String toString() {
		return("Inside toString"); 
	}
}
public class MyClass {
	public static void main(String args[]) {
		try {
			throw new MyClassException();
		}
		catch(MyClassException e) {
			out.println("Catched");
			out.println(e.getMessage());
			out.println(e);
		 
		}
	}
}
