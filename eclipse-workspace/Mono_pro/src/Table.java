import java.util.Scanner;
public class Table {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String yn;
		do
		{ 
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter a number for table:");
			
			int t= sc.nextInt();
			for(int i=1;i<=10;i++)
			{
				System.out.println(t+ "X" +i+ "=" +(t*i));
			}System.out.println("Do you want to continue(y for Yes and n for No)");
			yn = sc.next();
		
		}
		while(yn.equals("y")|| yn.equals("Y"));
       
	}

}
