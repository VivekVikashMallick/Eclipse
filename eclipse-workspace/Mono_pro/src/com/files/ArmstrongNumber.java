 package com.files;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
	   int no =378;
	   int lang=0;
	   int t1 =no;
	   int arm =0;
	   while(t1!=0)
	   {
		   t1=t1/10;
		   lang = lang+1;
	   }
	   int t2=no;
	   int rem;
	 
	   while(t2!=0)
	   {
		   int mult =1;
		   rem =t2%10;
		   
	   
	   for(int i=1;i<=lang;i++)
	   {
		   mult = mult*rem;
	   }
	   arm = arm + mult;
	   t2 = t2/10;
	   }
	   if(no ==arm)
	   {
		   System.out.println(" no is Armstrong Number ");
		   
	   }else
	   {
		   System.out.println(" is not ArmstrongNumber ");
	   }

	}

}
