package com.basic;

public class NumRev {

	public static void main(String s[]) {

		int n=1234,i=0;
		int t=n;
		int[]a=new int[10];
		while(n>0) {
		int remainder=n%10;
		a[i]=remainder;
		i++;
		n=n/10;
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
}
}

