package com.files;

public class Recursion {
	static int fact = 1;

	public static void main(String[] args)
	{
		int no = 5;
	   Recursion fr = new Recursion();
	   fr.calcFrRecur(no);
	   System.out.println("Factorial of " +no+ " is "+fact);
	}
	void calcFrRecur(int no)
	{
		if(no>=1)
		{
			fact = fact*no;
			calcFrRecur(no-1);
		}
	}

}
