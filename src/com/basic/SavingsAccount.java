package com.basic;

public class SavingsAccount {
     private double balance;
	public static double interest;
	public SavingsAccount(double a) {
		this.balance=a;
	}
 public  static void setInterest(double a) {
	 SavingsAccount.interest=a;
}
 public void interestCalculation()
 {
	 double b= (balance*interest)/12;
	 balance=balance+b;
	
	
 }
 public void getBalance()
 {
	 System.out.println("BALANCE IS "+balance);
 }

	
	public static void main(String s[]) {
		SavingsAccount saver1=new SavingsAccount(3000.0);
		SavingsAccount saver2=new SavingsAccount(2000.0);
		SavingsAccount.setInterest(0.04);
		saver1.interestCalculation();
		saver1.getBalance();
		saver2.interestCalculation();
		saver2.getBalance();
		
		
	}
}
