import java.util.Scanner;
class Complex{
	public int real;
	public int imaginary;
	Complex(){
		real =-1;
		imaginary =-1;
	}
	Complex(int x,int y){
		real = x;
		imaginary =y;
	}
	Complex(Complex obj){
		this.real = obj.real;
		this.imaginary = obj.imaginary;
	}
	/**	
	 * <h3> Add object to the parent object and returns the object of complex Class</h3>
	 * @brief To find the sum of a Complex number
	 * @author Ausaaf Nabi
	 * @see 
	 * 		 multiplyComplex();
	 * @return this */
	
	public Complex addComplex(Complex obj2) {
		this.real = this.real + obj2.real;
		this.imaginary = this.imaginary + obj2.imaginary;
		return this;
	}
	/**	
	 * <h3> Multiply the object to the parent object and returns the object of complex Class</h3>
	 * @brief To find the sum of a Complex number
	 * @author Ausaaf Nabi
	 * @see 
	 * 		 addComplex();
	 * 		 Show();
	 * 		to String(); //Overridden method
	 * @return this */
	
	public Complex multiplyComplex(Complex obj2) {	
		this.real = (this.real * obj2.real) - (this.imaginary* obj2.imaginary);
		this.imaginary = (this.imaginary*obj2.real)+(this.real*obj2.imaginary);
		return this;
	}
	
	public void Show() {
		System.out.println("The Complex number is :: "+this.real+" + "+ this.imaginary+ "i" );
	}
	
	public String toString() {
		return (this.real + "+ i" + this.imaginary);
	}
}
public class ComplexClass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Complex c1 =new Complex(5,6);
		Complex c2 =new Complex(4,9);
		Complex c3 =new Complex(c2);
		c2.addComplex(c1);
		c3.multiplyComplex(c1);
		System.out.println("Added Complex numbers :: "+ c2.toString());
		c3.Show();
		sc.close();
	}
}
