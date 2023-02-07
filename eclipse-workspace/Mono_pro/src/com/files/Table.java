package com.files;
import java.util.Scanner;

public class Table {

	public static void main(String[] args)
	{
		int t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for table");
		t = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(t+ " x "+i+" = "+(t*i));
		}
		sc.close();

	}

}
