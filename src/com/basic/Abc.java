package com.basic;

public class Abc {
 
	public void findMax(int string[])
	{
		int max=string[0];
		for(int i=0;i<string.length;i++)
		{
			
			if (string[i] >max)
			{
				max=string[i];        
				
			}
			
		}
		System.out.println(max);
	}
	public void findMin(int string[])
	{
		int min=string[0];
		for(int i=0;i<string.length;i++)
		{
			
			if (string[i] < min)
			{
				min=string[i];        
				
			}
			
		}
		System.out.println(min);
	}
	

	public static void main(String[] args) {
		int[] a= {3,4,5,2,33,24,2};
	
		Abc a1=new Abc();
		a1.findMax(a);
		a1.findMin(a);
		
			
		
	
	}
}
