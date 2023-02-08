import java.util.*;
class invertedFullPyramid{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size :");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
      {
        for(int k=0;k<i;k++)
        {
            System.out.print(" ");
        }
        for(int j=0; j<n-i;j++)
          {
            System.out.print("* ");
          }
        System.out.println();
      }
      sc.close();
  }
}
