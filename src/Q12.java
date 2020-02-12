
class Test{
	private int x;
	public int y;
	public int Mod( ) {
		return x;
	}
	Test(int i){
		x = i;
		y=3;
	}
}
public class Q12 {
	public static void main(String args[]) {
		Test t = new Test(7);
		Test t1 = new Test(4);
		Test t2 = new Test(5);
		System.out.println("The Test For Access Specifier");
		//System.out.println("x :"+ t.x ); It wont work
		System.out.println("x : "+ t.Mod()+ " y :: "+t.y);
		// Call by value
		System.out.println("Before Swap:: "+t1.Mod()+" , "+t1.y);
		swap(t1,t2);
		System.out.println("After Swap:: "+t1.Mod()+" , "+t1.y);
		
	}
	
	public static void swap(Test T1, Test T2) {
		Test temp = new Test(0);
		temp = T1;
		T1 = T2;
		T2 = temp;
	}
}
