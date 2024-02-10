package com.encapsulation.pkg1;

public class Common {
	private int length;
	private int width;
	private int height;
	
	public void setBoxDimension(int l , int b , int h) {
		if(l>=1 && b>=1 && h>=1) {
			System.out.println("Box created with dimesions "+l+" "+b+" "+h+" ");
		}else {
			System.out.println("Invalid dimensions");
		}
	}
	
	//	Setters
	public int setLength(int l) {
		if (l>=1) {
			length = l;
		}else {
			System.out.println("Number should be greater than or equals to 1 ");
		}	
		return length;
	}
	public int setWidth(int w){
		width = w;
		return width;
	}
	public int setHeight(int h) {
		height = h;
		return height;
	}
	
	//	Getters
	public int getLength(){
		return length;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight(){
		return height;
	}

}
