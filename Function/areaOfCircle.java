package Function;
import java.util.*;

public class areaOfCircle {
    private static double area(double radius)
    {
        double area=(22.0/7)*radius*radius;
        return area;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius :");
        double r=sc.nextDouble();
        System.out.println("The Area of the circle is "+ area(r));
        sc.close();
    }  
}