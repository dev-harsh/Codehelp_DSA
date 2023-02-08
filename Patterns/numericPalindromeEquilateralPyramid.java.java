import java.util.*;
class numericPalindromeEquilateralPyramid{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size :");
    int n=sc.nextInt();

    for(int i=1;i<=n;i++)
      {
        int x=1;
        for(int k=1;k<=n-i;k++)
          {
            System.out.print(" ");
          }
        for(int j=1; j<2*i;j++)
        {
            if(j<i)
                System.out.print(x++);
            else
                System.out.print(x--);
        }  
        System.out.println(); 
      }
      sc.close();
}
}