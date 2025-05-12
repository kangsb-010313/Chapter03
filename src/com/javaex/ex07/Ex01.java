package com.javaex.ex07;

public class Ex01 {

	public static void main(String[] args) {

		int a = 3; //기본
		System.out.println(a);
		
		Integer i = new Integer(3);
		System.out.println(i.toString());
		
		Integer sum = new Integer(3) + new Integer(3);
		System.out.println(sum);
		
		Integer v01 = 3;	//new Integer(3) -->자동으로 맞춰줌  => 박싱 이라고 부름
		System.out.println(v01.toString());
		
		Integer i01 = new Integer(999); //i01은 주소
		int b = i01;					//언박싱
		System.out.println(b);
		
		System.out.println("---------------------------------------");
		
		
		//덜 좋은 방식 --> 필요없는 99를 넣어야 한다
		// Integer r01 = new Integer(99); => 박싱이 되기 때문에 굳이 이렇게 쓸 필요가 없음
		Integer r01 = 99; //박싱
		int result = r01.parseInt("12345"); //"12345" --> 12345
		System.out.println(result + 3); // 문자열을 숫자로 바꿀 수 있음
		
		
		//조금 더 좋은 방식 (문자열-->정수) static 공부
		int result02 = Integer.parseInt("12345");
		System.out.println(result02 + 1);
		
		
		/////////////////////////////////////
		//정수 --> 문자열	12345 --> "12345"
		//덜 좋은 방식 --> 필요없는 "안녕"을 만들어야 한다
		String s = new String("안녕하세요");
		String sNum = s.valueOf("12345");
		System.out.println(sNum + 1);
		
		//조금 더 좋은 방식 (정수-->*문자열) static 공부
		String sNum02 = String.valueOf(12345.4);
		System.out.println(sNum02 + 1);
		//					(실수 -->*문자열) static 공부, 메소드 오버로딩
		String sNum03 = String.valueOf(12345.3343);
		System.out.println(sNum03 + 1);
		
		//숫자 --> 문자열
		//System.out.println(12345 + "1");
		String sNum4 = "" + 999;
		System.out.println(sNum4 +1);
		
		
		
		
		
	}

}
