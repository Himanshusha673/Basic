
import java.util.Scanner;
public class SurfaceAreaOfCylinder {

    public static void main(String [] args)
    {  double pie=3.14;
        Scanner sc = new Scanner( System.in);
        System.out.println("Eneter radius of cylinder");
double r=sc.nextFloat();
        System.out.println("enetr the height of theb cylindr");
double h =sc.nextFloat();
double s_area = 2*pie*(r*r+r*h);
System.out.println("total arae of cylinder is "+s_area);


    }

}
