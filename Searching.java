package com.files;

public class Searching {

	public static void main(String[] args) {
// (1)	int[] arr = {12,18,22,-5,-9,54,28,-48};
//	int target = 99;
//	System.out.println(linearSearch(arr,target));
//		
//
//	}
//	
//	static int linearSearch(int[] arr , int target){
//		if(arr.length==0) {
//			return -1;
//		}
//		
//		for(int index=0;index<arr.length;index++) {
//			int element = arr[index];
//			if(element==target) {
//			return index;
//			}
//		}
//		return -1;
		
//	(2)	int[] arr = {12,18,22,-5,-9,54,28,-48};
//		int target = 18;
//		System.out.println(linearSearch(arr,target,1,5));
//			
//
//		}
//		
//		static int linearSearch(int[] arr , int target, int start, int end){
//			if(arr.length==0) {
//				return -1;
//			}
//			
//			for(int index=start;index<= end;index++) {
//				int element = arr[index];
//				if(element==target) {
//				return index;
//				}
//			}
//			return -1;
		
		String name = "Vikash";
		char target = 'V';
		System.out.println(search(name,target));
	}
	static boolean search(String str,char target) {
		if(str.length()==0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(target==str.charAt(i)) {
				return true;
			}
			
		}
		return false;
	}

}
