package org.sample;

public class OverLoadd {
	static int c;
	public void add(int a,int b)
	{
		 c=a+b;
		System.out.println("addition of a and b is "+c);
	}
	public void add(int a)
	{
	 c=a*a;
	System.out.println("multiplication of a with a is "+c);
	
	}

	public static void main(String[] args) {
		OverLoadd ol=new OverLoadd();
		ol.add(8,8);
		ol.add(4);

	}

}
