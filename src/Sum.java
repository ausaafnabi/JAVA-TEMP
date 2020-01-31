import java.util.Scanner;
public class Sum {
	/**	@author Ausaaf Nabi
	 * @brief To find the sum of any no of integers 
	 * 	 
	 * @param	a	 To find the factorial of given number 
	 * @param 	b	to convert a decimal number to a binary number
	 * @see 
	 * 		 Binary()
	 * 		factorial()
	 * @return a+b */
	
	 static int SumOfTwo(int a,int b){
		return a+b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,sum;
		System.out.print("Enter first number  :: ");
		a = sc.nextInt();
		System.out.print("Enter second number :: ");
		b = sc.nextInt();
		sum = SumOfTwo(a,b);
		System.out.println("NUMBER 1 :: "+a+"\t NUMBER 2 :: "+b+"\tSUM :: "+sum);
		sc.close();
	}
}
