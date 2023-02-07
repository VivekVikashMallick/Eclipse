package com.files;

public class PrimeHundred {

	public static void main(String[] args)
	{
		int count =0;
		int no;
	
		for ( no =1;no<=100;no++)
		{
		    
			int temp = 0;
			for(int j =2; j<no-1;j++)
			{
				if(no%j==0)
				{
					temp = temp+1;
				}
				
			}if(temp==0)
			{
				System.out.println(no);
				
			}
			
			
		}while(no>0)
		{
			no = no/10;
			count++;
		}System.out.println(count);
		

	}

}
