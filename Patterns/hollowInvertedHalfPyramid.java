import java.util.*;
class hollowInvertedHalfPyramid{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size :");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
      {
        for(int j=1; j<=n-i;j++)
          {
            if(i==0||i==n-1||j==1||j==n-i)
                System.out.print("*");
            else
                System.out.print(" ");
          }
        System.out.println();
      }
      sc.close();
  }
}
