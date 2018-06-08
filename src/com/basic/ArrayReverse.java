package com.basic;

public class ArrayReverse {
     
	public void reverse(int a[])
	{int b[]= {};
		for(int i=a.length;i<0;i--,a.length--)
		{
			
			b[a.length]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
	public static void main(String[] args) {
		int a[]= {3,4,5,2,33,24,2};
		ArrayReverse c=new ArrayReverse();
		c.reverse(a);
	}
	
}
