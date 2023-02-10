package Array;
public class minMax
{
    public static int findMinimum(int arr[])
    {
        int min=arr[0];
        for(int i:arr)
        {
            if(i<min)
            {
                min=i;
            }
        }
        return min;
    }

    public static int findMaximum(int arr[])
    {
        int max=arr[0];
        for(int i:arr)
        {
            if(i>max)
            {
                max=i;
            }
        }
        return max;
    }
}