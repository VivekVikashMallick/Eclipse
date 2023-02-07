import java.util.Scanner;
public class Leap_year {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		year = sc.nextInt();
		
	/*	if(year%4 == 0)
		{
			if(year%100 == 0 )
			{
				if(year%400 == 0 )
				{
					System.out.println("This is a leap year");
				}else
				{
					System.out.println("This is not a leap year");
				}
				
				System.out.println("This is a leap year");
			}else 
			{
				System.out.println("This is not a leap year");
			}
			
			System.out.println("This is a leap year");
		}else
		{
			System.out.println("This is not a leap year");
		}*/
		
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
		{
			System.out.println("This is a leap year");
		}else
		{
			System.out.println("This is not a leap year");
		}
		
		sc.close();

	}

}
