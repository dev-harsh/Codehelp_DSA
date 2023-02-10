package Function;
import java.util.*;
public class reverse {
    private static int numreverse(int n)
    {
        int digit, rev=0;
        while(n>0)
        {
            digit=n%10;
            rev=(rev*10)+digit;
            n=n/10;
        }return rev;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        System.out.println(numreverse(n));
        sc.close();
    }
}
