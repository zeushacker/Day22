package com.study;

import java.util.Scanner;

// �л��� ���� ������ �����ϱ� ���� Ŭ���� ����
class SungVO {
	// ��� ���� ����
	String name;
	int[] score = new int[3];// ����, ����, ����
	int tot, avg, rank;
}

// ����ó���� ���� Ŭ����
class SungjukService {
	
	// �ִ� 50���� �����͸� ó���ϱ� ���� ������ ���� ����
	private SungVO[] ss = new SungVO[50];
	
	// �ο���
	private int count;
	
	Scanner sc = new Scanner(System.in);
	
	// �ڷ��Է� �Լ�����
	public void input() {
	
		if(count >=50) {
			System.out.println("\n �Է� �ʰ� ........\n");
			return ;
		}
		
		System.out.println("\n �ڷ� �Է� .............");
		String[] title = {"����:", "����:", "����"};
		
		// �ݵ�� �޸� �Ҵ��� �ؾ���
		ss[count] = new SungVO();
		
		System.out.print("�̸� �Է�:");
		ss[count].name = sc.next();
		
		// ���� �Է�
		for(int i=0; i<ss[count].score.length; i++) {
			System.out.print(title[i]);
			ss[count].score[i] = sc.nextInt();//���� ���� �Է�
			// �������ϱ�
			ss[count].tot += ss[count].score[i]; 
			
		}
		
		ss[count].avg = ss[count].tot/3;
		count++;// �ο��� ����
	    System.out.println();	
	}
	
	// ���� ���ϱ�
	public char grade(int s) {
		
		char c;
		switch(s) {
		
		case 10:
		case 9: c ='A'; break;
		case 8: c ='B'; break;	
		case 7: c ='C'; break;
		case 6: c ='D'; break;
		default : c ='F'; break;
		}
		return c;
	}
	
	// ���� ���ϱ�
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
	
	// �ڷ� ���
	public void write() {
		
		System.out.println("��¹ٶ��ϴ�.");
		
		
	}
	
	// �ڷ� �˻�(�̸�)
	public void search() {
	
		System.out.println("\n �ڷ� �˻�................");
		
		System.out.print("�˻��� �̸� :");
		String name = sc.next();
		
		for(int i = 0; i<count; i++) {
			
		//	if()
			
			
			
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
				System.out.print("1.�Է� 2.�˻� 3.��� 4.����");
				ch = sc.nextInt();
			}while(ch <1 || ch >4);
			
			switch(ch) {
			case 1: service.input();  break;
			case 2: service.search();  break;
			case 3: service.write(); break;
			case 4:  System.exit(0); break;
			//���α׷� ���� ����
			}
		}
	}
}
