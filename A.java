package com.files;

class A{
	void showA()
	{
		System.out.println("a class method");
		
	}
}
class B extends A
{
	void showB()
	{
		System.out.println("b class method");
	}
	
	public static void main(String[] args)
	{
		A ob1 = new A();
		ob1.showA();
//		ob1.showB();
		B ob2 = new B();
		ob2.showA();
		ob2.showB();
		
	}
}
class C extends B
{
	void showC()
	{
		System.out.println("c class method");
	}
     public static void main(String[] args)
     {
    	 C ob3 = new C();
    	 ob3.showC();
    	 ob3.showB();
    	 ob3.showA();
     }
}