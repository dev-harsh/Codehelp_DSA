package Array;

public class twoPointers {
    public static void extremePrint(int[] ar){
        int start=0;
        int end=(ar.length)-1;
        while(start<=end)
        {
            if(start<end)
                System.out.print(ar[start++]+" ");
            
            System.out.print(ar[end--]+" ");
        }
    }

    public static void reverseArray(int ar[]){
        int start=0;
        int end=(ar.length)-1;
        while(start<end)
        {
            //swap using XOR
            ar[start] = ar[start] ^ ar[end];
            ar[end] = ar[start] ^ ar[end];
            ar[start] = ar[start] ^ ar[end];
            start++;
            end--;
        }
        for(int i:ar)
            System.out.print(i+" ");
    }
}
