package Oct.ex_18102024;

import java.util.Scanner;

public class Lab_23Switch
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //int Num1;
        System.out.println("Enter the number for Num1:");
        int Num1 = sc.nextInt();

        //int Num2;
        System.out.println("Enter the number for Num2:");
        int Num2 = sc.nextInt();

        System.out.println("Enter the operator (+, -, *, /)");
        char operator = sc.next().charAt(0);
        switch (operator)
        {
            case '+':
               System.out.println("Addition is:"+(Num1+Num2));
               break;
            case '-':
                System.out.println("Subtraction is:"+(Num1-Num2));
                break;
            case '*':
                System.out.println("Multiplication is:"+(Num1*Num2));
                break;
            case '/':
                System.out.println("Division is:"+(Num1/Num2));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
