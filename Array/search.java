package Array;

public class search {
    public static boolean linearSearch(int ar[], int key)
    {
        boolean isPresent=false;
        for(int i:ar)
        {
            if(i==key)
                isPresent=true;
                break;
        }
        return isPresent;
    }
}