import java.util.*;
class numericFullPyramid{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size :");
    int n=sc.nextInt();
    int count;
    for(int i=1;i<=n;i++)
      {
        count=i;
        for(int k=1;k<=n-i;k++)
          {
            System.out.print(" ");
          }
        for(int j=1; j<=(2*i)-1;j++)
          {
            if(j<i)
              System.out.print(count++);
            else
              System.out.print(count--);
          }
        System.out.println();
      }
      sc.close();
  }
}