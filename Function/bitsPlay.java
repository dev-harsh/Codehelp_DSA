package Function;
import java.util.*;
public class bitsPlay {
    public static int setKthBit(int n, int k)
    {
        int bit = 1<<k;
        n = n|bit;
        return n;
    }
    public static int countSetBit(int n)
    {
        int count=0;
        while(n>0)
        {
            if((n&1)==1)
                count++;
            n=n>>1;
        }
        return count;
    }

    public static int decimalToBinaryDivisionMethod(int n)
    {
        int binary=0;
        int bit=0;
        int bitcount=0;
        while(n>0)
        {
            bit=n%2;
            binary=(int)(bit * Math.pow(10,bitcount++)) + binary;
            n=(int)n/2;
        }
        return binary;
    }

    public static int decimalToBinaryBitMethod(int n)
    {
        int binary=0;
        int bit=0;
        int bitcount=0;
        while(n>0)
        {
            bit=n&1;
            binary=(int)(bit * Math.pow(10,bitcount++)) + binary;
            n=n>>1;
        }
        return binary;
    }

    public static int binaryToDecimal(int n)
    {
        int num=0;
        int bit=0;
        int bitcount=0;
        while(n>0)
        {
            bit=n%10;
            num=(int)(bit * Math.pow(2,bitcount++)) + num;
            n=(int)n/10;
        }
        return num;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
        // System.out.print("Enter the value of k");
        // int k=sc.nextInt();
        // System.out.print(setKthBit(n,k));

        // System.out.println("Number of Set bits are : "+countSetBit(n));

        // System.out.println("Binary Equivalent is : "+decimalToBinaryDivisionMethod(n));
        // System.out.println("Binary Equivalent is : "+decimalToBinaryBitMethod(n));

        System.out.println("Decimal Equivalent is : "+binaryToDecimal(n));

        sc.close();
    }
}