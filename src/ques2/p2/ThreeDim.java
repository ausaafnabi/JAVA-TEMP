package p2;

import p1.TwoDim;

public class ThreeDim extends TwoDim{
    private int z;
    TwoDim ob = new TwoDim();
    public ThreeDim(){
        super();
        z=0;
    } 
    public ThreeDim(int D1,int D2,int D3){
        super(D1,D2);
        z=D3;
    }

    public String toString(){
       // System.out.print(ob);
        return( "X-Coordinate:: "+super.x+" Y-Coordinate:"+super.y+ " Z-Coodinate: "+z);
    }
}