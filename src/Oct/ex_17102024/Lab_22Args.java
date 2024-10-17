package Oct.ex_17102024;

public class Lab_22Args
{
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        System.out.println(args[0]+"\n"+ args[1]+"\n" + args[2]);

        int avg = ((num1+num2+num3)/3);
        char grade;
        if (avg<0 || avg>100)
        {
            System.out.println(" Invalid Input");
        }
        else if (avg>=90)
        {
            grade = 'A';
            System.out.println("Grade is: "+grade);
        }
        else if (avg>=80)
        {
            grade = 'B';
            System.out.println("Grade is: "+grade);
        }
        else
        {
            grade = 'F';
            System.out.println("Grade is: "+grade);
        }
    }
}
