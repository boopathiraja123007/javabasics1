package com.basic;

public class Shape {
	double length,breadth;
	

	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		
		if((20.0<length) && (length<0.0 ))
			System.out.println("INVALID LENGTH ");
		else
		this.length = length;
		System.out.println("LENGTH IS "+length);
	}


	public double getBreadh() {
		return breadth;
	}


	public void setBreadth(double breadth) {
		if((20.0<breadth) && (breadth<0.0 ))
			System.out.println("INVALID BREADTH ");
		else
		this.breadth = breadth;
		System.out.println("BREADTH IS "+breadth);
	}
 public double areaCalcluation()
 {
	 return length*breadth;
 }

	public static void main(String s[])
	{
		Shape s1=new Shape();
		s1.setBreadth(5.0);
		s1.setLength(2.0);
		System.out.println("AREA OF RECTANGLE IS "+s1.areaCalcluation());
	}
}
