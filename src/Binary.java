import java.util.Scanner;
public class Binary {

	/**	@author Ausaaf Nabi
	 * @params To find the sum of any no of integers 
	 * 	 
	 * @params To find the factorial of given number 
	 * @params to convert a decimal number to a binary number
	 * @see SumOfTwo();
	 * 		factorial()
	 * @return a+b */
	 static void BinaryOfNumber(int e) 
	    { 
	        int binary[] = new int[16]; //@param int[16] to support 16 bit binary variable
	        int i = 0; 
	        for( ; e > 0 ;i++)  
	        {  
	            binary[i] = e % 2; 
	            e = e / 2; 
	           
	        } 
	   
	        for (int j = i - 1; j >= 0; j--) 
	            System.out.print(binary[j]); 
	    } 
	 public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int a;
			System.out.print("Enter number to find its Binary  :: ");
			a = sc.nextInt();
			 BinaryOfNumber(a);
			sc.close();
	 }
}
