package com.basic;

public class ArrayRev {
	public void arrayRev(int a2[],int c)
	{
		for(int i=c-1;i!=0;i--)
		{
			System.out.println(a2[i]);
		}
		
	}
	public static void main(String[] args) {
		int a[]= {2,5,7,24,87,45,76};
		int c=a.length;
		
		ArrayRev a1=new ArrayRev();
		a1.arrayRev(a,c);
	}

}
