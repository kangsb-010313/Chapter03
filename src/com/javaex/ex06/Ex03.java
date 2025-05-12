package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {

		String s01 = new String("안녕하세요");
		String s02 = new String("안녕하세요");
		
		System.out.println(s01 == s02); //주소가 같니? new 는 주소가 다르다
		System.out.println(s01.equals(s02)); //글자가 같니? equals() 사용해야 한다
		
		System.out.println("---------------------------------");
		
		String s03 = "굿모닝";
		String s04 = "굿모닝";
		
		System.out.println(s03 == s04); //주소가 같니? --> 약식은 주소가 같다
		System.out.println(s03.equals(s04)); //글자가 같니?
		
		s03 = "굿나잇!-!";				//기존값을 바꾸면 문제가 되므로 새로 만든다
		System.out.println(s03 == s04); // 주소가 달라진다
		System.out.println(s03.equals(s04)); //굿나잇!-! 과 굿모닝 같니?
		
		System.out.println("--------------------------------");
		
		String s05 = "안녕";
		
		if(s05.equals("안녕")) { //같다는 무조건 equals 로 쓴다
			System.out.println("같다");
		}
		
		System.out.println("--------------------------------");
		
		s05 = null;
		if("안녕".equals(s05)) { //순서를 바꿔 쓰면 null point 예외상황을 피할 수 있다
			System.out.println("같다");
		}
		
		
		
		
	}

}
