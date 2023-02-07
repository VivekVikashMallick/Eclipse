package Sort.files;


public class Bubble_sort
{

	public static void main(String[] args) 
	{
		
		
		 
	
	  int[] a = {10,4,14,21,98,28,124,150,136,116,84};
	  int temp;
	  
	  for (int i=0;i<a.length;i++)
	  {
		  for(int j=0;j<a.length-1-i;j++)
		  {
			  if(a[j]>a[j+1])
			  {
				  temp = a[j];
				  a[j] = a[j+1];
				  a[j+1] = temp;
			  }
			  
		  }
	  } 
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.print(a[i]+" ");
	  }
	

	}

}
