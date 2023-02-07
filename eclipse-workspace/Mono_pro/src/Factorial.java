import java.util.Scanner;
public class Factorial {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a factorial number");
		int t =sc.nextInt();
		int fact=1;
		for(int i=1;i<=t;i++)
		{
			fact= fact*i;
		}
		System.out.println("Factorial of "+ t+" is "+fact);
		
		sc.close();

	}

}
