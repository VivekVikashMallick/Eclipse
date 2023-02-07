package com.files;

public class FindEvenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
			int[] nums = {18,124,9,1764,98,10};
		 System.out.println(findNumber(nums));
		
		}
		static int findNumber(int[] nums) {
			int count = 0;
			for(int num:nums) {
				if(even(num)) {
					count++ ; 
				}
			}
			return count;
		}
	        static boolean even (int num) {
			int numberOfDigits = 0;
			try {
				numberOfDigits = digits(num);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			if (numberOfDigits % 2 ==0) {
//				return even;
//			}
//		 return false;
//}
			
			 return numberOfDigits % 2 ==0;
			}
		 
		
		

		 static int digits(int num) {
			int count = 0 ;
			while (num > 0) {
				count++;
				 num = num/10;
				 
			}
			return count;
		}
	   


}


