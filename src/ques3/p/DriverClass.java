package p;
import p1.Shape;
import p2.Rectangle;
import p3.Circle;
import java.util.Scanner;

public class DriverClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Circle circ = new Circle();
        Rectangle rect= new Rectangle();
        Shape shape;
        int ch;
        double len,bre;
        System.out.println("###########################");
        System.out.println("###         MENU        ###");
        System.out.println("###########################");
        System.out.println("# 1 : Area of Rectangle   #");
        System.out.println("# 2 : Area of Circle      #");
        System.out.println("#=========================#");
        System.out.println("#    ENTER YOUR CHOICE:   #");
        System.out.println("###########################");
        System.out.print("@ ");
        ch = sc.nextInt();
        System.out.println("");
        if(ch==1){
            System.out.print("Enter Length: ");len = sc.nextDouble();
            System.out.print("Enter Breadth: ");bre = sc.nextDouble();
            shape = rect;
            shape.area(len,bre);
            System.out.println(shape);
        }
        else if(ch==2){
            System.out.print("Enter Radius: ");len = sc.nextDouble();
            shape = circ;
            shape.area(len,0);
            System.out.println(shape);
        }
        else{
            System.out.print("INVALID CHOICE!!!");
        }
        sc.close();


    }
}