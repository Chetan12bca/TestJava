package Oct.ex_03102024;

public class Lab001
{
    public static void main (String[] args)
    {
        int A=5, B=6, C;
        {
            C = A*B;
            System.out.println("Mulitplication is: "+C);
            {
                C= A+B;
                System.out.println("Addition is: "+C);
            }
        }

    }
}
