package Array;
import java.util.*;
public class arrayDriver {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the array elements :");
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();
        System.out.print("Minimum value in the array is "+minimum.findMinimum(arr));

        sc.close();
    }
}