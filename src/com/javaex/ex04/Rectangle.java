package com.javaex.ex04;

public class Rectangle { //기본값 Object클래스 상속받음

	
	//필드
	private int width;
	private int height;
	
	
	//생성자
	public Rectangle() {
		super(); //Object 클래스 상속
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	//메소드 gs 
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	//메소드 일반
	public boolean equals(Object obj) {
		boolean result;
		
		Rectangle r = ((Rectangle)obj);
		
		if(this.width == r.width && this.height == r.height) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
	
	
	
	
	
}
