import java.util.Scanner;
public class FactByRecurssion {
	static int fact = 1;
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the factorial number");
		int t = sc.nextInt();
		int fact;
		
		FactByRecurssion sf = new FactByRecurssion();
		fact = sf.RecrFact(t);
		System.out.println("Factorial of "+t+" is "+fact);
         sc.close();
	}
	/*void RecrFact(int t)
	{
		if(t>=1)
		{
			fact = fact*t;
			RecrFact(t-1);
		}
	}*/
	int RecrFact(int t)
	{
		if(t>=1)
		{
			return (t*RecrFact(t-1));
		}
		return 1;
	}

}
