package P1;

public class TwoDim {
	private int x;
	private int y;
	public TwoDim(){
		x=-1;
		y=-1;
	}
	public TwoDim(int a,int b) {
		x =a;
		y =b;
	}
	
	public String toString() {
		return ("( "+x +" ,"+y+")");
	}
}
