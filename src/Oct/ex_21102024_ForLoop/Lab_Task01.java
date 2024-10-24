package Oct.ex_21102024_ForLoop;

import java.util.Scanner;

public class Lab_Task01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int i = sc.nextInt();

        for (i=5; i>=0; i--)
            System.out.println(i);
    }
}
