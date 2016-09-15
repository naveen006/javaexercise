package org.sample;

class InterfA implements InterFc{
	public void run()
	{
		System.out.println("hello i am running");
	}

	public static void main(String[] args) {
		InterfA a=new InterfA();
		a.run();
		System.out.println("something changed");

	}

}
