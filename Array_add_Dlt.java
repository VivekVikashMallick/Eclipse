package com.files;

import java.util.Scanner;

public class Array_add_Dlt 
{

	public static void main(String[] args)
	{
	   int n,m;
	   Scanner sc =new Scanner (System.in);
	   System.out.println("Enter the total no. to be inserted in the array.");
	   n= sc.nextInt();
	   
/*	   int[] a= new int[n];
	   int[] b= new int [n+1];
	   
	   for(int i=0;i<n;i++)
	   {
		   a[i]=sc.nextInt();
		   
	   }
	   System.out.println("Enter the index value where the value is going to be inserted.");
	   m=sc.nextInt();
	   System.out.println("Enter the new value");
	   p=sc.nextInt();
	   for(int i=0;i<n+1;i++)
	   {
		   if (i<m)
		   {
			   b[i]=a[i];
		   }
		   else if(i==m)
		   {
			   b[i]=p;
		   }
		   else
		   {
			   b[i]=a[i-1];
		   }
		   
	   }
	   System.out.println("values are");
	   for(int i=0;i<n+1;i++)
	   {
		   System.out.print(b[i]+" ");
	   }*/
	   
//	   for deleting an element from array.
	   int[] a= new int[n];
	   int[] b= new int [n-1];
	   
	   for(int i=0;i<n;i++)
	   {
		   a[i]=sc.nextInt();
		   
	   }
	   System.out.println("Enter the index value where the value is going to be deleted.");
	   m=sc.nextInt();
	  
	   for(int i=0;i<a.length;i++)
	   {
		   if (i<m)
		   {
			   b[i]=a[i];
		   }
		   else if(i==m)
		   
			continue;   
		   
		   else
		   {
			   b[i-1]=a[i];
		   }
		   
	   }
	   System.out.println("values are");
	   for(int i=0;i<n-1;i++)
	   {
		   System.out.print(b[i]+" ");
	   }
	   sc.close();
	 }
	

}
