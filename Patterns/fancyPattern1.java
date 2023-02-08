import java.util.*;
class fancyPattern1{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size :");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=0; j<8-i;j++)
            System.out.print("*");
        for(int j=1; j<=(2*i)+1;j++)
            if(j%2!=0)
                System.out.print(i+1);
            else
                System.out.print("*");
        for(int j=0; j<8-i;j++)
            System.out.print("*");
        System.out.println();
    }
    sc.close();
}
}