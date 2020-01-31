import java.util.Scanner;
public class TypeConversion {
	
	static float multiply(float x,float y ) {
		return x*y;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.print("Enter the first number :: ");
		x = sc.nextInt();
		System.out.print("Enter the Second number :: ");
		y = sc.nextInt();
		
		float sum = multiply(x,y);
		System.out.print("MULTIPLICATION :: " + sum);
		sc.close();
	}
}
