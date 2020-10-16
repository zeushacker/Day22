package com.study;

import java.util.Scanner;

// 학생의 성적 정보를 저장하기 우한 클래스 정의
class SungVO {
	// 멤버 변수 선언
	String name;
	int[] score = new int[3];// 국어, 영어, 수학
	int tot, avg, rank;
}

// 성적처리를 위한 클래스
class SungjukService {
	
	// 최대 50명의 데이터를 처리하기 위한 참조형 변수 선언
	private SungVO[] ss = new SungVO[50];
	
	// 인원수
	private int count;
	
	Scanner sc = new Scanner(System.in);
	
	// 자료입력 함수선언
	public void input() {
	
		if(count >=50) {
			System.out.println("\n 입력 초과 ........\n");
			return ;
		}
		
		System.out.println("\n 자료 입력 .............");
		String[] title = {"국어:", "영어:", "수학:"};
		
		// 반드시 메모리 할당을 해야함
		ss[count] = new SungVO();
		
		System.out.print("이름 입력:");
		ss[count].name = sc.next();
		
		// 점수 입력
		for(int i=0; i<ss[count].score.length; i++) {
			System.out.print(title[i]);
			ss[count].score[i] = sc.nextInt();//과목별 점수 입력
			// 총점구하기
			ss[count].tot += ss[count].score[i]; 
			
		}
		
		ss[count].avg = ss[count].tot/3;
		count++;// 인원수 증가
	    System.out.println();	
	}
	
	// 학점 구하기
	public char grade(int s) {
		
		char c;
		switch(s/10) {
		
		case 10:
		case 9: c ='A'; break;
		case 8: c ='B'; break;	
		case 7: c ='C'; break;
		case 6: c ='D'; break;
		default : c ='F'; break;
		}
		return c;
	}
	
	// 석차 구하기
	private void ranking() {
		
		for(int i = 0; i<count; i++) 
			ss[i].rank =1;
		
		for(int i = 0; i<count-1; i++) {
			for(int j = i+1; j < count; j++) {
				if(ss[i].tot > ss[j].tot) 
					ss[j].rank++;
				else if(ss[i].tot <ss[j].tot)
					ss[i].rank++;
			}
	  }
	}
	
	// 자료 출력
	public void write() {
	
		System.out.println("\n 전체 출력................");
		
		ranking();
		
		for(int i = 0; i<count; i++) {
			System.out.print(ss[i].name+"\t\t");
			for(int j = 0; j<ss[i].score.length;j++) {
				System.out.printf("%5d", ss[i].score[j]);
			}
			System.out.printf("%5d%5d%5d%5c", ss[i].tot, ss[i].avg, ss[i].rank,grade(ss[i].avg));
	         // 총점, 평균, 석차

			/*
			// 학점 출력
			System.out.print("\t\t");
			for(int j =0; j<ss[i].score.length; j++) {
				System.out.printf("%5c", grade(ss[i].avg));
			}
			*/
			System.out.println();
		}
	}
	
	// 자료 검색(이름)
	public void search() {
	
		System.out.println("\n 자료 검색................");
		
		System.out.print("검색할 이름 :");
		String name = sc.next();
		
		for(int i = 0; i<count; i++) {
			
		if(ss[i].name.equals(name)) {
	       // 문자열은 equals() 를 이용해서 비교해야함
		   System.out.print(ss[i].name+"\t\t");
		   for(int j = 0; j<ss[i].score.length; j++) {
			   System.out.printf("%5d", ss[i].score[j]);
		   }
		 }
		System.out.println();
	}
  }
}

public class SungjukMain {

	public static void main(String[] args) {
		
		SungjukService service = new SungjukService();
		
		Scanner sc = new Scanner(System.in);
		int ch;
		
		while(true) {
			do {
				System.out.print("1.입력 2.검색 3.출력 4.종료");
				ch = sc.nextInt();
			}while(ch <1 || ch >4);
			
			switch(ch) {
			case 1: service.input();  break;
			case 2: service.search();  break;
			case 3: service.write(); break;
			case 4:  System.exit(0); break;
			//프로그램 강제 종료
			}
		}
	}
}
