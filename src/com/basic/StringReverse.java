package com.basic;

public class StringReverse {
	public void reverse(int a)
	{
		int b=a%10;
		System.out.print(b);
		int c=a/10;
		int d=c%10;
		System.out.print(d);
		int e=c/10;
		int f=e%10;
		System.out.print(f);
		int g=e/10;
		System.out.print(g);
	}

	public static void main(String s[])
	{
		StringReverse sr=new StringReverse();
		sr.reverse(1234);
		
	}
}
