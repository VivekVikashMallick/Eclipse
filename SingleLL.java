package com.files;

import java.util.Scanner;

public class SingleLL 
{
	static class Node
	{
	  int data;
	  Node next;
	  Node(int data)
	  {
		  this.data=data;
		  this.next=null;
	  }
	}
	Node head=null;
	public void creation ()
	{
		int data,n;
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("Enter data");
			data = sc.nextInt();
			Node new_node = new Node(data);
			if(head==null)
			{
				head=new_node;
			}
			else {
				new_node.next=head;
				head =new_node;
			}
			System.out.println("Do you want to add more data.If yes press:1");
			n = sc.nextInt();
		}
		while(n==1);
	}
	public void traverses()
	{
		Node temp =head;
		if(head==null)
		{
			System.out.println("Linked list does not exist");
		}
		else
		{
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args)
	{
		SingleLL a=new SingleLL();
		a.creation();
		a.traverses();

	}

}
