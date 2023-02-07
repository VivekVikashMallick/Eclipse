package com.files;

public class FibonacciSeries {
	static int a =0, b =1, c;

	public static void main(String[] args) 
	{
		/* Fibonacci = Means the every 3^rd number is the sum of previous two.*/
		System.out.println(a+ "  "+b);
        FibonacciSeries ob  = new FibonacciSeries();
        ob.FibRecr(10);
	}
	void FibRecr(int i)
	{
		if(i>=1)
		{
		c = a+b ;
		System.out.println(" "+c);
		a = b;
		b = c;
		FibRecr(i-1);
		}
	}

}
//void FibRecr()
//{
//	FibRecr();.........call itself to infinity times
//}