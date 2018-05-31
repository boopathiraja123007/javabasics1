package com.basic;
import java.util.Scanner;
public class ToCheckPowerOfTwo {
	public static void main(String s[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int b= a&(a-1);
		if((a!=0)&&(b==0))
			System.out.println("YES");
		else 
			System.out.println("NO");
	}

}
