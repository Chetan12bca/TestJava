package Oct.ex_17102024;

import java.util.Scanner;

public class Lab_TriangleSides
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side A:");
        int A = sc.nextInt();

        System.out.println("Enter the side B:");
        int B = sc.nextInt();

        System.out.println("Enter the side C:");
        int C = sc.nextInt();

        if (A<=0 || B<=0 || C<=0)
        {
            System.out.println("Invalid Input:"+A+B+C);
        }
        else if (A==B && B==C)
        {
            System.out.println("Traingle is Equilateral.\nsides are:\n"+A+"\n"+B+"\n"+C);
        }
        else if (A==B || B==C || C==A)
        {
            System.out.println("Triangle is Isosceles.\nsides are:\n"+A+"\n"+B+"\n"+C);
        }
        else
        {
            System.out.println("Triangle is Scalene.\nsides are:\n"+A+"\n"+B+"\n"+C);
        }
        sc.close();
    }
}
