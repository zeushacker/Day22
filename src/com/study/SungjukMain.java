package com.study;

import java.util.Scanner;

// 학생의 성적 정보를 저장하기 우한 클래스 정의
class SungVO {
	// 멤버 변수 선언
	String name;
	int[] score = new int[3];// 국어, 영어, 수학
	int tot, avg, rank;
}


public class SungjukMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch;
		
		
		while(true) {
			
			do {
				System.out.print("1.입력 2.검색 3.출력 4.종료");
				ch = sc.nextInt();
			}while(ch <1 || ch >4);
			
			switch(ch) {
			case 1:     break;
			case 2:     break;
			case 3:     break;
			case 4:  System.exit(0); break;
			//프로그램 강제 종료
			}
		}
	}

}
