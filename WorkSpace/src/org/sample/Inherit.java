package org.sample;

public class Inherit extends Sup {
	public void work()
	{
		System.out.println("hi i am working");
	}

	public static void main(String[] args) {
		Inherit i=new Inherit();
		i.run();
		i.work();
		System.out.println("changed");

	}

}
