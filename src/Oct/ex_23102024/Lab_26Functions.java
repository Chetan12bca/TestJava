package Oct.ex_23102024;

import java.util.Scanner;

public class Lab_26Functions
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();

        add(a,b);
        //System.out.println(add(a,b));
        //multi(a,b);
        System.out.println(multi(a,b));
       // sub(a,b);
        System.out.println(sub(a,b));
       // div(a,b);
        System.out.println(div(a,b));

        max(a,b);

        sc.close();
    }

    static int add(int a, int b)
    {
        System.out.println("Sum is:"+(a+b));
        return a+b;
    }

    static int multi(int a , int b)
    {
        return a*b;
    }

    static int sub(int a, int b)
    {
        return a-b;
    }

    static int div(int a, int b)
    {
        return a/b;
    }
    static void max(int a, int b)
    {
        if (a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
}
