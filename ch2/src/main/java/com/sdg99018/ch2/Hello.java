package com.sdg99018.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //1. 원격 호출 가능한 프로그램으로 등록 
public class Hello {
	
	@RequestMapping("/hello")
	private void main() {
	System.out.println("private 도 출력 가능!!");
	}
	
	
//	int aa= 10;    // 인스턴스 변
//	static int bb=20;  // static 변수 
//	
//	@RequestMapping("/hello")  // 2,URL 과 메소드를 연결 
//	private void main() {   // 인스턴스 메소드 (aa,bb ,둘다 사용가능하다.)
//		System.out.println("Hello");
//		 System.out.println(aa);  // o
//		 System.out.println(bb);  // o
//	
//	}
//	
//	public static void main2() { // static 메소드(bb 만 사용가능하다.)  왜냐하면 static 메소드는 인스턴스 메소드를 쓸수 없다.
////	 System.out.println(aa);  // x
//	 System.out.println(bb);  // o
//	}
}
