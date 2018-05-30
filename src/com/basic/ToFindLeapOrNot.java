package com.basic;
import java.util.Scanner;

public class ToFindLeapOrNot {
	public static void main(String s[]) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the year");
	int year=sc.nextInt();
	if(year%4==0)
	{
		System.out.println("Leap year");
	}
	else 
	{
		System.out.println("Non Leap year");
	}
	}
    
}
