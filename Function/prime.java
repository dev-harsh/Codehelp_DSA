package Function;
import java.util.*;

import javax.sound.sampled.BooleanControl;
public class prime {
    
    private static void primeCheck(int n)
    {
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime==true)
            System.out.println("Prime Number");
        else
            System.out.println("Non-Prime Number");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        primeCheck(n);
        sc.close();
    }    
}