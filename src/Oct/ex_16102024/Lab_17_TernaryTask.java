package Oct.ex_16102024;

public class Lab_17_TernaryTask
{
    public static void main(String[] args)
    {
        System.out.println(args[0]);
        System.out.println(args[1]);
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int max = num1 >= num2 ? num1 : num2;
        System.out.println("Maximum number is:"+max);

    }
}
