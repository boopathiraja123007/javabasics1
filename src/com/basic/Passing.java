package com.basic;

public class Passing {

	public static void main(String[] args) {
		pass p1=new pass();
		int b=20;
     p1.Method1(b);
	System.out.println(b);
	       
	}
}
 class pass{
	  
	public int Method1(int b)
	{
		
		b=10;
		System.out.println(b);
		return b;
	}

}
 