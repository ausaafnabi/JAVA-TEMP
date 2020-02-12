//import java.util.Scanner;
public class VarLenFunc {
	/**	<h2>To find the sum of any no of integers using Variable Length Argument </h2>
	 * <p></p>
	 * @param a
	 * 	@author Ausaaf Nabi 
	 */
	public static void varlenSum(int ...a) {
		System.out.println("The Number of arguments :: " + a.length);
		int sum =0;
		for(int i:a) {
			sum += i; 
		}
		System.out.println("Sum :: " + sum);
	}
	public static void main(String args[]) {
	//	Scanner sc = new Scanner(System.in);
		varlenSum(1,2,3,4);
		varlenSum(2,3,4);
	}
}
