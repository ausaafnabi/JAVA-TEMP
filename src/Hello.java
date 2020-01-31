import java.util.Scanner;

public class Hello {
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
	/**	@author Ausaaf Nabi
	 * @params To find the sum of any no of integers 
	 * 	 
	 * @params To find the factorial of given number 
	 * @params to convert a decimal number to a binary number
	 * @see SumOfTwo();
	 * 		factorial()
	 * @return a+b */
	 static void Binary(int e) 
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
	 
	 static int Prime(int f) {
		 int flag=0;
		 if(f==0||f==1) flag++;
		 else {
			 for(int i=2;i<f;i++) {
				 if(f%i==0) {
					 flag++;
				 }
			 }
		 }
		 return flag;
	 }
	 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a,b,d,e,f,flagCheck,sum =0;
		//##################################################################################
		
		System.out.println("MENU");
		System.out.println("1. Command Line Arguments");
		System.out.println("2. SUM");
		System.out.println("3. Factorial");
		System.out.println("4. Decimal To Binary");
		System.out.println("5. Prime");
		System.out.println("Enter Your Choice :: ");

		//##################################################################################
		System.out.println("######### SUM By CommandLine Arguments############ ");
	
		for(int x = 0; x<args.length;x++) {
			sum += Integer.parseInt(args[x]);
		}
		System.out.println("SUM :: " + sum);
		//##################################################################################
		System.out.println("######### SUM ############ ");
		System.out.println("enter the value of a:: ");
		a = sc.nextInt();	// @params a	use to store value 1
		System.out.println("enter the value of b:: ");
		b = sc.nextInt();	// @params b use to store value 2
		
		System.out.println("The sum to 2 numbers is :: "+SumOfTwo(a,b)); //@call Sum(int,int)
		
		//##################################################################################
		System.out.println("######### FACTORIAL ############ ");
		System.out.println("enter the value to find its factorial:: ");
		d = sc.nextInt();	// @params d {type:description :: use to store value 3}
		
		System.out.println("The factorial of the number :: " + Factorial(d));
		
		//##################################################################################
		System.out.println("#########Decimal To Binary ############ ");
		System.out.println("enter the value to find its Binary:: ");
		e = sc.nextInt();	// @params e {type:description :: use to store value 4}
		
		//Binary(e);
		
		System.out.println(Integer.toBinaryString(e));
		//##################################################################################
		System.out.println("#########PRIME############ ");
		System.out.println("enter the value to check its Prime:: ");
		f = sc.nextInt();	// @params f {type:description :: use to store value 5}
		flagCheck = Prime(f);
		if(flagCheck == 0) {
			System.out.println("The Number "+f+" is a PRIME");
		}
		else {
		
				System.out.println("The Number "+f+" is not a PRIME");
		}
		sc.close();
	}
}
