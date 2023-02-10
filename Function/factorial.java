package Function;
import java.util.*;
public class factorial {
    private static int factorialCalc(int n)
    {
        int result=1;
        for(int i=1;i<=n;i++)
        {
            result*=i;
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        System.out.println("The factorial is "+factorialCalc(n));
    }    
}