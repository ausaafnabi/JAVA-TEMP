package P2;

import P1.TwoDim;
public class ThreeDim {
	private int z;
	TwoDim t =new TwoDim();
	public ThreeDim(){
		
		z = -1;
	}
	public TwoDim(int a,int b,int c) {
		t(a,b);	
		x= c;
	}
	
	public String toString() {
		return ("( "+t.x +" ,"+t.y+" , "+z+" )");
	}
}
