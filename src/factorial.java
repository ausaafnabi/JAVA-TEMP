import java.util.Scanner;
public class factorial {
	/**<h3>
	 * {@code}  for(int i = 1; i<=a;i++) {
		 c *= i; 
	 }</h3>
	 <h4>This function is responsible  for finding the factorial of a number</h4>
	 <button>Click me! </button>
	 * 
	 * 	@author	 Ausaaf Nabi
	 * @see 	SumOfTwo();
	 * 		 	Binary()
	 * 	
	 * @return c*/
	static int Factorial(int a) {
		int c = 1;
		for(int i = 1; i<=a;i++) {
			c *= i; 
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter number to find its factorial  :: ");
		a = sc.nextInt();
		System.out.print("Factorial  :: " + Factorial(a));
		sc.close();
	}
}
