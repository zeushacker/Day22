package com.study;

import java.util.Scanner;

// �л��� ���� ������ �����ϱ� ���� Ŭ���� ����
class SungVO {
	// ��� ���� ����
	String name;
	int[] score = new int[3];// ����, ����, ����
	int tot, avg, rank;
}


public class SungjukMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch;
		
		
		while(true) {
			
			do {
				System.out.print("1.�Է� 2.�˻� 3.��� 4.����");
				ch = sc.nextInt();
			}while(ch <1 || ch >4);
			
			switch(ch) {
			case 1:     break;
			case 2:     break;
			case 3:     break;
			case 4:  System.exit(0); break;
			//���α׷� ���� ����
			}
		}
	}

}
