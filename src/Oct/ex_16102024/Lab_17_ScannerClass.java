package Oct.ex_16102024;

import java.util.Scanner;

public class Lab_17_ScannerClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your Salary");
        double salary = sc.nextDouble();

        System.out.println("Name is:" + name + "\nAge is:"+age + "\nSalary is:" + salary);

        sc.close();
    }
}
