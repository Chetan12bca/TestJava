package Oct.ex_18102024;

import java.util.Scanner;

public class Lab_24Switch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the case number:");
        int value = sc.nextInt();
        System.out.println("Enter the value:");
        double range = sc.nextDouble();
        switch (value)
        {
            case '1':
                System.out.println("Converting KM to miles:"+(range * 0.62137119));
                break;
            case 2:
                System.out.println("Converting miles to KM:"+(range*1.60934));
                break;
            case 3:
                System.out.println("Converting celsius to Fahrenheit:"+(range - 32)*5/9);
                break;
            case 4:
                System.out.println("Converting Fahrenheit to celsius:"+(5/9*(range-32)));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
