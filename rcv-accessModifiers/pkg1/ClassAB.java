package com.rcv.pkg1;

import java.security.PublicKey;

public class ClassAB {
	public static void main(String[] args) {
		
		//Accessing the ClassA method from ClassA.java file	where both files are on the same sub package
		ClassA ca = new ClassA();
		ca.protectedMethod();
		
		//classAB object
		ClassAB cab = new ClassAB();
		
	}
	public void methodAB() {
		System.out.println("I am MethodAB");
	}

}
