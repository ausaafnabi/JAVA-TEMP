package p3;
import p1.Shape;

public class Circle extends Shape{
    //double PI = 3.14162863;
    double area =0;
    public void area(double length,double breadth){
        area = 3.14162863*length*length;
    }
    public String toString(){
        return("Area of Circle: "+area);
    }
}