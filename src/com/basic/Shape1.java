package com.basic;

public class Shape1 {

	double length,breardth,radius;
	int side;
	public Shape1(int a) {
		int areaS=4*a;
		System.out.println("AREA OF SQUARE "+areaS);
	}
	public Shape1(int a,double b)
	{this(a);
		double areaR=a*b;
		System.out.println("AREA OF RECTANGLE "+areaR);
	}
	
	public Shape1(double a)
	{ 
		double areaC=3.14*a*a;
		System.out.println("AREA OF CIRCLE "+areaC);
	}


	public static void main(String s[]) {
	//Shape1 s2=new Shape1(5);
	 Shape1 s3= new Shape1(5,6.0);
	// Shape1 s4= new Shape1(7.5);
	
	
	
}
}
