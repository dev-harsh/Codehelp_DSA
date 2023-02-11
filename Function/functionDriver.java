package Function;
import java.util.*;
public class functionDriver {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        // System.out.print("Enter a number :");
        // int a=sc.nextInt();
        // System.out.print("Enter the other number :");
        // int b=sc.nextInt();
        // System.out.println("The sum is "+add.twoNums(a,b));

        // System.out.print("Enter the other number :");
        // int c=sc.nextInt();
        // System.out.println("The max amoung 3 is "+Function.minMax.findMaxOf3(a, b, c));
        System.out.print("Enter the distance in kilometer :");
        float km=sc.nextFloat();
        System.out.println("The distance in miles is "+convert.kmToMiles(km));
        
        sc.close();
    }    
}