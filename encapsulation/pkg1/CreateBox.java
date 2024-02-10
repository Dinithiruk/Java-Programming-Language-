package com.encapsulation.pkg1;

public class CreateBox {
	public static void main(String[] args) {
		Common cm = new Common();
		
		// accessing with public access modifiers
		// int h = cm.height = 10;
		// int l = cm.length = 20;
		// int b = cm.width = 30;
		
		// access with setters and getter 
		int h =cm.setHeight(10);
		int b = cm.setWidth(0);
		int l = cm.setLength(0);
		
		cm.setBoxDimension(l, b, h);
		
		System.out.println("Length : " + cm.getLength());
	}

}
