import java.util.*;
class numericHollowInvertedHalfPyramid{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size :");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
      {
        for(int j=i; j<=n;j++)
          {
            if(i==1||i==n||j==n||j==i)
              System.out.print(j);
            else
             System.out.print(" ");
          }
        System.out.println();
      }
      sc.close();
  }
}