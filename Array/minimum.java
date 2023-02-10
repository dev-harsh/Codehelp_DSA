package Array;

public class minimum{
    public int findMinimum(int arr[])
    {
        int min=arr[0];
        for(int i:arr)
        {
            if(i<min)
                min=i;
        }
        return min;
    }
}