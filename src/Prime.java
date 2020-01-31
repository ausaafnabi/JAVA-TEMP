import java.util.Scanner;
import java.lang.Math;
public class Prime {

	/**	<h3> to convert a decimal number to a Prime number;</h3>
	 * <p></p>
	 * @author Ausaaf Nabi
	 * 
	 * @return flag
	 * @see SumOfTwo();
	 * 		factorial();
	 * @return a+b */
	 static int PrimeOfNumber(int f) {
		 int flag=0;
		 if(f==0||f==1) flag++;
		 else {
			 for(int i=2;i<=Math.sqrt(f);i++) {
				 if(f%i==0) {
					 flag = 1;
					 break;
				 }
			 }
		 }
		 return flag;
	 }
	 public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int f,flagCheck;
			System.out.println("#########PRIME############ ");
			System.out.print("enter the value to check its Prime:: ");
			f = sc.nextInt();	// @params f {type:description :: use to store value 5}
			flagCheck = PrimeOfNumber(f);
			if(flagCheck == 0) {
				System.out.println("The Number "+f+" is a PRIME");
			}
			else {
			
					System.out.println("The Number "+f+" is not a PRIME");
			}
	/*		
			
			for(int i =0 ;i<10000;i++) {
				flagCheck = PrimeOfNumber(i);
				if(flagCheck == 0) {
					System.out.print(i+",");
				}
				else {
				
				//		System.out.println("The Number "+i+" is not a PRIME");
				}
			} */
			sc.close();
	 }
}
