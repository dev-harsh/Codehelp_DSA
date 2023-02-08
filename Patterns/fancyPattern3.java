import java.util.*;
class fancyPattern3{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size :");
    int n=sc.nextInt();
    for(int i=1;i<n;i++)
      {
        int count=1;
        for(int j=1; j<=(2*i)-1;j++)
          {
            if(j==1||j==(2*i)-1)
                System.out.print("*");
            else
                if(j<i)
                    System.out.print(count++);
                else
                    System.out.print(count--);
          }
        System.out.println();
      }
      for(int i=n;i>0;i--)
      {
        int count=1;
        for(int j=1; j<=(2*i)-1;j++)
          {
            if(j==1||j==(2*i)-1)
                System.out.print("*");
            else
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