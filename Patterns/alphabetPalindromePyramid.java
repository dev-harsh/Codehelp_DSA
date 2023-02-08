import java.util.*;
class alphabetPalindromePyramid{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size :");
    int n=sc.nextInt();

    for(int i=1;i<=n;i++)
      {
        char ch='A';
        for(int j=1; j<2*i;j++)
        {
            if(j<i)
                System.out.print(ch++);
            else
                System.out.print(ch--);
        }  
        System.out.println(); 
      }
      sc.close();
}
}