package Oct.ex_16102024;

import java.util.Scanner;

public class Lab_18Mathematic_Funcs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the numbers");
        System.out.println("Enter the Number for A:");
        int A = sc.nextInt();

        System.out.println("Enter the number for B:");
        int B= sc.nextInt();


        int C = A+B;
        System.out.println("Sum is:"+C);

        int D = A*B;
        System.out.println("Multiplication is:"+D);

        System.out.printf("Division is: %d",A/B);

        sc.close();
    }
}
