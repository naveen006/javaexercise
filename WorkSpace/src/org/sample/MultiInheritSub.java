package org.sample;

 class MultiInheritSub implements MultiInheritSup,Calling {
	 public void ring()
	 {
		 System.out.println("phone is ringing");
		 
	 }

	 public void call()
	 {
		 System.out.println("calling");
	 }
	public static void main(String[] args) {
		MultiInheritSub ms=new MultiInheritSub();
		ms.ring();
		ms.call();
		System.out.println("hi multi");

	}

}
