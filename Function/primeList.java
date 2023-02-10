package Function;
import java.util.*;
public class primeList {
    
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
            System.out.println(n);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
            primeCheck(i);
        sc.close();
    }    
}