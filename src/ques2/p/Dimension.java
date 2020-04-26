package p;
//import p1.TwoDim;
import p2.ThreeDim;
import java.util.Scanner;
public class Dimension extends ThreeDim{

    public static void main(String[] args){
        int D1,D2,D3;
        Scanner sc = new Scanner(System.in);
        System.out.println("########################");
        System.out.println("ENTER THE COORDINATES:: ");
        System.out.print(" X :");D1=sc.nextInt();
        System.out.print(" Y :");D2=sc.nextInt();
        System.out.print(" Z :");D3=sc.nextInt();

        ThreeDim ob = new ThreeDim(D1,D2,D3);
        System.out.println(ob);
    }
}