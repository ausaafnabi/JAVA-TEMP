import java.util.Scanner;
public class Exceptionhandler {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a:");
		int a = sc.nextInt();
		
		System.out.print("Enter b:");
		int b = sc.nextInt();
		int x= 0;
		try
		{  
			x=a/b;  
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}  
		System.out.println("a/b = "+x);
		sc.close();
	}
}
