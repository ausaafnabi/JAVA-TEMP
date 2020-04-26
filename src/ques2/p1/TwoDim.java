package p1;
public class TwoDim{
    protected int x,y;

    public TwoDim(){
        x=0;y=0;
    }
    public TwoDim(int D1,int D2){
        x=D1;y=D2;
    }

    public String toString(){
        return("X-Coordinate:: "+x+" Y-Coordinate:"+y);
    }
    //-------------------------------------------END OF PACKAGE 1----------------------------------------------------
}