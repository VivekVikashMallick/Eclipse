
public class FibByRecurssion {
	static int a=0,b=1,c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a+ " "+b);
		FibByRecurssion ob= new FibByRecurssion();
		ob.printFib(10);
	
	}void printFib(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
			printFib(i-1);
		}
	}

}
