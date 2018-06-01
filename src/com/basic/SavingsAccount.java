package com.basic;

public class SavingsAccount {
    public double balance;
	public static double interest;
	public SavingsAccount(double a) {
		balance=a;
	}
 public  static void setInterest(double a) {
	 SavingsAccount.interest=a;
}
 public double interestCalculation()
 {
	
	 double b= (balance*interest)/12;
	 balance=balance+b;
	 double c=balance;
	 return c;
		
	
	
 }
 /*public void getBalance(int t)
 {for(int a=0;a<5;a++)
	{
	
	 System.out.println("SAVER "+a+" BALANCE IS "+balance);}
	*/
 

	
	public static void main(String s[]) {
		int a=5;
		SavingsAccount[] saver1=new SavingsAccount[5];
		for(int i=0;i<5;i++)
		{
			saver1[i]=new SavingsAccount(i*1000);
		}
	
		SavingsAccount.setInterest(0.04);
		/*for(int i=0;i<5;i++)
		{
		saver1[i].interestCalculation();}*/
		for(int i=0;i<5;i++)
		{
			System.out.println("SAVER "+i+" BALANCE IS "+saver1[i].interestCalculation());
		}
		
		
	}
}
