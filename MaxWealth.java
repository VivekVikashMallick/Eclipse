package com.files;
import java.util.Scanner;

public class MaxWealth {
 int[][] accounts = {{1,2,3},{4,5,6}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int person = sc.nextInt();
		System.out.println(person);
		int accounts = sc.nextInt();
		System.out.println(accounts);
		
//		System.out.println(person(accounts));
	}
	
		
//		private static char[] person(int[][] accounts) {
//		// TODO Auto-generated method stub
//		return null;
//	}


		
		public static int maximumWealth(int[][] accounts) {
			int ans = Integer.MIN_VALUE ;
			
			for(int person = 0; person<accounts.length;person++) {
				int sum =0;
				
				for(int account =0; account<accounts[person].length;account++) {
					sum += accounts[person][account]; 
				}
				if(sum > ans) {
					ans = sum;
				}
			}
			return ans;
		}
	

	}
	


