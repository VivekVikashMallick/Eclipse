package star.files;

public class IncreasingNumber
{

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l);
			}
			System.out.println(" ");
		}

	}

}
