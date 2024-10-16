package Oct.ex_10102024;

import java.util.Scanner;

public class Lab_19
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for A:");
        int A = sc.nextInt();

        System.out.println("Enter the Number for B:");
        int B = sc.nextInt();

        int C = A+B;

        System.out.printf("%d + %d = %d",A,B,C);

    }
}
