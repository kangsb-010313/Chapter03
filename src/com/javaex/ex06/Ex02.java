package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = " abcd";
		String b = ",efg ";

		/*
		System.out.println(a+b);
		System.out.println(a.concat(b)); //a 문자열에 b 문자열을 합쳐라
		// -->원본이 망가지진 않고 출력할 때만 합쳐라
		
		System.out.println(b+a);
		System.out.println(b.concat(a)); //b 문자열에 a 문자열을 합쳐라
		*/
		
		//실험을 위해서 a 값을 바꾼다
		a = a.concat(b);					//concat() --> 문자열을 합친다
		System.out.println(a);
		
		a = a.trim();						//trim() --> a의  문자열의 좌우(양쪽 끝) 공백을 제거한다 (중간 공백은 불가능)
		System.out.println(a);
		
		a = a.replace("ab", "12");			//a의 문자열에서 ab 를 12로 바꾼다 --> 글자 수 상관없음
		System.out.println(a);
		
		System.out.println("---------------------------------------");
		
		String[] sArray = a.split(",");		//a의 문자열을 ","를 기준으로 나누어서 배열에 담는다
		for(int i=0; i<sArray.length; i++) {//그리고 배열의 주소를 리턴한다
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		System.out.println("---------------------------------------");
		
		String str = "Hello JAVA!";
		String result01 = str.substring(3);		// 선택한 방부터 그 뒤로 쭉 출력
		System.out.println(result01);
		
		String result02 = str.substring(1, 7); 	// 선택한 방~선택한 방 전까지 출력
		System.out.println(result02);
		
		char c = str.charAt(10);					//선택한 방의 값만 출력
		System.out.println(c);
		
		
		
		
		
		
		
	}
	
	
}
