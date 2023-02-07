import java.util.*;
public class pascalTriangle {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the size :");
      int n=sc.nextInt();
      int count=0;
      for(int i=0;i<n;i++)
        {
            for(int k=1;k<n-i;k++)
                System.out.print(" ");
            count=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(count+" ");
                count=count*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}