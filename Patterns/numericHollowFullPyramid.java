import java.util.*;
public class numericHollowFullPyramid {
    public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size :");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
      {
        for(int k=1;k<=n-i;k++)
          {
            System.out.print(" ");
          }
        for(int j=1; j<=i;j++)
          {
            if(i==1||i==n||j==1||j==i)
              System.out.print(j+" ");
            else
              System.out.print("  ");
          }
        System.out.println();
      }
      sc.close();
  }
}
