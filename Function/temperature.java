package Function;
import java.util.*;
public class temperature {
    private static double toFarenheit(double c)
    {
        double f=(9*c/5)+32;
        return f;
    }
    private static double toKelvin(double c)
    {
        double k=c+273.15;
        return k;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in celcius");
        double c=sc.nextDouble();
        System.out.println("Temperature in Farenheit :"+ toFarenheit(c));
        System.out.println("Temperature in Kelvin :"+ toKelvin(c));
        sc.close();
    }
}
