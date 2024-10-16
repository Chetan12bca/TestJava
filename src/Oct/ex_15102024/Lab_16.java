package Oct.ex_15102024;

public class Lab_16
{
    public static void main(String[] args)
    {
        int a=40, b=50, c=30;
        //int max = (a>b?a:b)>c?(a>b?a:b):c;
        int max = (a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println(max);
    }
}
