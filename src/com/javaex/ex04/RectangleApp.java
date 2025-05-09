package com.javaex.ex04;

public class RectangleApp {

	public static void main(String[] args) {

		
		
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(6, 4);
		Rectangle c = new Rectangle(12, 2);
		
		// com.javaex.ex04.Rectangle@2f92e0f4 이런식으로 안 나오게 하기
		System.out.println(a); //toString() 재정의
		System.out.println(b);
		System.out.println(c);

		
		
		System.out.println("==equals 값 비교");
		System.out.println(a.equals(b)); //true
		System.out.println(a.equals(c)); //false
		
		
	}

}
