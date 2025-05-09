package com.javaex.ex05;

public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle a = new Rectangle(6, 4); //24
		Rectangle b = new Rectangle(6, 4); //24
		Rectangle c = new Rectangle(12, 2); //24
		Rectangle d = new Rectangle(3, 8); //24
		Rectangle e = new Rectangle(12, 4); //48
		
		System.out.println(a.equals(b)); //24 == 24 => true
		System.out.println(a.equals(c)); //24 == 24 => true
		System.out.println(a.equals(d)); //24 == 24 => true
		System.out.println(a.equals(e)); //24 == 48 => false
		System.out.println(d.equals(e)); //24 == 48 => false
		
		
	}
	
}
