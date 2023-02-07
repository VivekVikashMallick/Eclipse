package star.files;

public class StarPattern4 
{

	public static void main(String[] args)
	{
		for(int i=1;i<=6;i++)
		{
			for(int k=1;k<=(i-1);k++)
			{
				System.out.print(" ");
			}
		
			for(int j=6;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
