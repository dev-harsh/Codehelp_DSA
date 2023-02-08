import java.util.*;
class fancyPattern2_1{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size :");
    int n=sc.nextInt();
    int count=1;
    for(int i=0;i<n;i++)
      {
        for(int j=0; j<=2*i;j++)
          {
            if(j%2!=0)
                System.out.print("*");
            else
                System.out.print(count++);
          }
        System.out.println();
      }

      for(int i=n-1;i>=0;i--)
      {
        count=count-i-1;
        for(int j=0; j<=2*i;j++)
          {
            if(j%2!=0)
                System.out.print("*");
            else
                System.out.print(count+(j/2));
          }
        System.out.println();
      }
      sc.close();
  }
}