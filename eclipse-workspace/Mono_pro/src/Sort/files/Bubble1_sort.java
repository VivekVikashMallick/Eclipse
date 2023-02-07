package Sort.files;

import java.util.Scanner;

public class Bubble1_sort {

	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of list for sorting.");
		a = sc.nextInt();
		
		int[] b = new int[a];
		
		for(int C =0;C<a;C++)
		{
			System.out.println("Enter you number"+(C+1));
			b[C]= sc.nextInt();
		}
		sc.close();
		
		 int temp;
		  
		  for (int i=0;i<a;i++)
		  {
			  int flag=0;
			  for(int j=0;j<a-1-i;j++)
			  {
				  if(b[j]>b[j+1])
				  {
					  temp = b[j];
					  b[j] = b[j+1];
					  b[j+1] = temp;
					  flag=1;
				  }
				  
			  }
			  if(flag==0)
			  {
				  break;
			  }
		  } 
		  for(int i=0;i<a;i++)
		  {
			  System.out.print(b[i]+" ");
		  }
	}

}
