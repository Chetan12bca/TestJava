package Oct.ex_23102024;

import java.util.Scanner;

public class Lab_27
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius:");
        double Celsius = sc.nextDouble();

        System .out.println("Enter the temperature in Fahrenheit:");
        double Farh = sc.nextDouble();

        Temp_Covert(Celsius);
        Farh_Convert(Farh);


        sc.close();
    }
    static double Temp_Covert(double Celsius)
    {
        System.out.println("Celsius to Fahrenheit is:"+Celsius * 9 / 5);
        return (Celsius);
    }
    static double Farh_Convert(double Farh)
    {
        System.out.println("Fahrenheit to Celsius  is:"+(Farh - 32) * 5 / 9);
        return (Farh);
    }
}
