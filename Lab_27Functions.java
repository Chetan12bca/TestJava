import java.util.*;

public class Lab_27Functions
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number for A: ");
		int A = sc.nextInt();

		System.out.println("Enter the Number for B: ");
		int B = sc.nextInt();

		System.out.println("Result is: "+ (Add(A, B)));
		Multi(A, B);
		Sub(A, B);
		Div(A, B);
		
		sc.close();
	}
	static int Add(int A, int B)
	{
		//System.out.println(A+B);
		return A+B;
	}
	static int Multi(int A, int B)
	{
		System.out.println(A*B);
		return A*B;
	}
	static int Sub(int A, int B)
	{
		System.out.println(A-B);
		return A-B;
	}
	static int Div(int A, int B)
	{
		System.out.println(A/B);
		return A/B;
	}
}
