package com.basic;

public class ArrayReverse {
//     
//	public void reverse(int a[])
//	{int b[]= {};
//		for(int i=a.length;i<0;i--)
//		{
//			
//			b[a.length]=a[i];
//			
//		}
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.println(b[i]);
//		}
//	}
//	public static void main(String[] args) {
//		int a[]= {3,4,5,2,33,24,2};
//		ArrayReverse c=new ArrayReverse();
//		c.reverse(a);
//	}
//	
	public static void main(String[] args) {
		int arr[]= {1,2,4,2,56,78,23,68};
		int arr1[]=new int[arr.length];
		System.arraycopy(arr,2 ,arr1,0,arr.length-2);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			
		}
	}
	
}
