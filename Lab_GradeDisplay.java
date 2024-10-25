import java.util.Scanner;

public class Lab_GradeDisplay
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score to check grade:");
		int score = sc.nextInt();

		char grade;
		
		if(score<0 || score>100)
			{
				System.out.println("Score is Invald");
		
			}
		else if(score >= 90)
			{
				grade = 'A';
				System.out.println("Grade is:"+grade);
			}
		else if(score >= 80)
			{
				grade = 'B';
				System.out.println("Grade is:"+grade);
			}
		else if(score >= 70)
			{
				grade = 'C';
				System.out.println("Grade is:"+grade);
			}
		else if(score >= 60)
			{
				grade = 'D';
				System.out.println("Grade is:"+grade);
			}
		else
			{
				grade = 'f';
				System.out.println("FAILED:"+grade);
			}
		sc.close();
	}
		
}