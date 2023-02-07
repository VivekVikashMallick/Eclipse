package com.files;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		
		int numb =121;
		int temp = numb;
		int rev =0;
		int rem;
		while (temp!=0)
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		if(numb==rev)
		{
			System.out.println("Given number is Palindrome Number:"+numb);
			
		}else
		{
			System.out.println("Number is not a palindrome number.:"+numb);
		}

	}

}
