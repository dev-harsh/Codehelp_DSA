package Function;

public class minMax {
    public static int findMaxOf3(int a, int b, int c)
    {
        if(a>b)
        {
            if(a>c)
                return a;
            else
                return c;
        }
        else{
            if(b>c)
                return b;
            else
                return c;
        }
    }
}