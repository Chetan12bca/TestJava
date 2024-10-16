package Oct.ex_16102024;

import java.util.Scanner;

public class Lab_19COnvertTemperature
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsius");
        double C = sc.nextDouble();

        double D = (C*9/5)+32;

        System.out.println("Enter the Temperature in Fahrenheit");
        double F = sc.nextDouble();

        double E = (F-32)*5/9;

        System.out.println("Converted Celsius to Fahrenheit:"+D);
        System.out.println("Converted Fahrenheit to celsius"+E);

        sc.close();

    }
}
