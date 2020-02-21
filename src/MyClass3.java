
public class MyClass3 {
	public static void main(String args[]) {
		int a=10,b=0;
		int cal[] =  {1,2,3};
		
		try {
			//int div = a/b;
			cal[5] = 9;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("caught"+e);
		}
	}
}
