package p2;
import p1.Shape;
public class Rectangle extends Shape{
    double area =0;
    public void area(double length,double breadth){
        area = length*breadth;
    }

    public String toString(){
        return("Area of Rectangle : "+area);
    }
}