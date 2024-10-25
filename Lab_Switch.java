import java.util.Scanner;

public class Lab_Switch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the case operator:");
		char operator = sc.next().charAt(0);
		
		System.out.println("Enter the number for Num1:");
		int Num1 = sc.nextInt();

		System.out.println("Enter the number for Num2:");
		int Num2 = sc.nextInt();
		
		switch (operator)
		{
			case '+':
			System.out.println("Additin is:"+(Num1+Num2));
			break;

			case '-':
			System.out.println("Subtraction is:"+(Num1-Num2));
			break;

			case '*':
			System.out.println("Miltiplication is:"+(Num1*Num2));
			break;

			case '/':
			System.out.println("Division is:"+(Num1/Num2));
			break;

			case '$':
			System.out.println("Invalid Input");
			break;

		}
			sc.close();
	}
}