import java.util.Scanner;
public class Calculator
{

	public static void main(String[] args)
	{
		
		String yn;
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter your first number");
			int a = sc.nextInt();
			System.out.println("\nEnter your second number");
			int b = sc.nextInt();
			System.out.println("Select the symbol(+,-,*,/,%)");
			String symb = sc.next();
			int res ; 
			switch(symb)
			{
			case"+": res = a + b ;
			
				System.out.println("Addition is:"+res);
				break;
			case "-": res = a-b;
			System.out.println("Subtraction is:"+ res);
			break;
			case "*":res = a*b;
			System.out.println("Product is:"+res);
			break;
			case "/":res = a/b;
			System.out.println("Division is:"+ res);
			break;
			case "%": res = a%b;
			System.out.println("Modulas is:"+ res);
			break;
			default:	System.out.println("invalid symbol");
			
				break;
			
			}
			
		System.out.println(" Do you want to continue(y for Yes and n for No)");
		yn = sc.next(); 
		
		
	  }
		while(yn.equals("y") || yn.equals ("Y"));
		
	
	}

}
