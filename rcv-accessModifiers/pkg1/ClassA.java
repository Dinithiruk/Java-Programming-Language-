package com.rcv.pkg1;

public class ClassA {
	public int publicVariable = 1;
	int defaultVariable = 2;
	private int privateVariable = 3;
	protected int protectedVariabe = 4;
	
	public static void main(String[] args) {
		 ClassA ca = new ClassA();
		 ca.publicMethod();
	}
	
	public void publicMethod() {
		System.out.println("Public Method");
	}
	
	void defaultMethod() {
		System.out.println("Default Method");
	}
	
	private void privateMethod() {
		System.out.println("Private Method");
	}
	
	protected void protectedMethod() {
		System.out.println("Protected Method");
	}
	
	
}
