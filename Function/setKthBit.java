package Function;
import java.util.*;
public class setKthBit {
    public static int bitSet(int n, int k)
    {
        int bit = 1<<k;
        n = n|bit;
        return n;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        System.out.print("Enter the value of k");
        int k=sc.nextInt();
        System.out.print(bitSet(n,k));
        sc.close();
    }
}