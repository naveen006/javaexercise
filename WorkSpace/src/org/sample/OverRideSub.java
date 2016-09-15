package org.sample;

public class OverRideSub extends OverRideeSup {
	public void add(int a,int b){
		int d=a*b;
		System.out.println("multiplication of a and b is "+d);
	}

	public static void main(String[] args) {
		OverRideSub os=new OverRideSub();
		os.add(3,4);
		os.add(3,4);
		
		

	}

}
