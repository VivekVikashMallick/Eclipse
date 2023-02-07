package com.files;

public class ArrayListExample {

	public static void main(String[] args)
	{
// (1)	  ArrayList<Integer>list = new ArrayList<>(10);
//	  
//	  list.add(27);
//	  list.add(274);
//	  list.add(273);
//	  list.add(275);
//	  list.add(205);
//	  list.add(201);
//	  list.add(147);
//	  list.add(2227);
//	  list.add(412);
//	  list.add(456);
//	  list.add(568);
//	  list.add(26);
//	  list.add(234);
//	  list.add(123);
//	  list.add(321);
//	  list.add(456);
//	  list.add(859);
//	  list.add(268);
//	  
//     System.out.println(list);
//     list.set(0, 87);
//     System.out.println(list);
//     System.out.println(list.contains(157489));
//	(2)	Scanner sc = new Scanner(System.in);
//		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//		
//		for(int i=0;i<3;i++) {
//			list.add(new ArrayList<>());
//		}
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<3;j++) {
//				list.get(i).add(sc.nextInt());
//				
//			}
//			System.out.print(list);
//		   
//		}
//		sc.close();
		
   int[] nums = {23,15,16,24,19,-5,-9,81,-11,28};
   int target = 288;
   int ans = linearSearch(nums,target);
   System.out.println(ans);
			
		
	}
	
  static int linearSearch (int[] arr, int target) {
	  if(arr.length==0) {
		  return -1;
	  }
	  for(int index=0; index<arr.length;index++) {
		  int element = arr[index];
		  if(element==target) {
		  return index;
	   }
	  }
	  return -1;
  }
	
 }

