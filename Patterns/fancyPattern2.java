import java.util.*;
class fancyPattern2{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size :");
    int n=sc.nextInt();

    for(int i=1;i<=n;i++)
      {
        for(int j=1; j<2*i;j++)
        {
            if(j%2==0)
                System.out.print("*");
            else
                System.out.print(i);
        }  
        System.out.println(); 
      }

      for(int i=n;i>=1;i--)
      {
        for(int j=1; j<2*i;j++)
        {
            if(j%2==0)
                System.out.print("*");
            else
                System.out.print(i);
        }  
        System.out.println(); 
      }
      sc.close();
}
}