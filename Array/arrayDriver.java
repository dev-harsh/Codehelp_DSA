package Array;
import java.util.*;
public class arrayDriver {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 5 array elements :");
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        
        
        // System.out.println("Minimum value in the array is "+minMax.findMinimum(arr));
        // System.out.println("Maximum value in the array is "+minMax.findMaximum(arr));
        
        // System.out.print("Enter the search Element: ");
        // int key=sc.nextInt();
        // System.out.print("Search result is "+search.linearSearch(arr, key));
        
        // count.zeroOne(arr);

        //twoPointers.extremePrint(arr);

        twoPointers.reverseArray(arr);

        sc.close();
    }
}