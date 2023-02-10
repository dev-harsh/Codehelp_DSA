package Function;
import java.util.*;

public class evenOrOdd {
    private static void evenOddCheck(double n)
    {
        if(n%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        double n=sc.nextDouble();
        evenOddCheck(n);
    }    
}