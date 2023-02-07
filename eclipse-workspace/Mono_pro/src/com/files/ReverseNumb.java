package com.files;

public class ReverseNumb {

	public static void main(String[] args)
	/*{
	    int no = 654321;
	    int rem,rev = 0;
	    while (no!=0)
	    {
	    	rem = (no%10 );
	    	rev = rev*10 + rem;
	    	no = no/10;
	    }
	    System.out.println("Reverse of given no is:"+rev);

	}
	Reverse a string............
	*/
	{
		String name = "Kumar";
		int leng = name.length();
		String rev = " ";
		for(int i = leng-1;i>=0;i--)
		{
			rev = rev + name.charAt(i);
		}
		System.out.println("Reverse of " +name+ " is "+rev);
	}

}
