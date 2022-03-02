package com;

public class TryAndCatchExample {

	public static void main(String[] args) {
	System.out.println("hi");
	int a=10;
	int b=1;
	int abc[]= {10,20,30,40};
	try {
		int res = a/b;
	    System.out.println("Res"+res);
	int res1 = 10/abc[2];
	System.out.println("REs"+res1);				
	}catch(Exception e) {
		//System.out.println("I take care");
		System.out.println(e.toString());
	}
	System.out.println("Bye");
	System.out.println("Bye");
	}

}
