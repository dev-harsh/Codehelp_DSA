package Array;

public class count {
    public static void zeroOne(int[] ar)
    {
        int zeroCount=0;
        int oneCount=0;
        for(int i:ar)
        {
            if(i==0)
                zeroCount++;
            else if(i==1)
                oneCount++;
        }
        System.out.println("Number of 0's in the array"+zeroCount);
        System.out.println("Number of 1's in the array"+oneCount);
    }
    
}
