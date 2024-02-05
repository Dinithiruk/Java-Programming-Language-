package com.rcv.pkg2;

import com.rcv.pkg1.*;


public class ClassB {
	public static void main(String[] args) {
		
		//Accessing the ClassA method from ClassA.java file which is outside the package 	
		ClassA ca = new ClassA();
		ca.publicMethod();
		
		//Accessing the ClassAB method from ClassAB.java file which is outside the package 	
		ClassAB cab = new ClassAB();
		cab.methodAB();
	}
}
