package com.study;

/*  ���� �л��� ������ �Է¹޾� ������ ���� ������� ����� �ο��Ͽ�
 *  ����� ����ϴ� ���α׷��� �����Ͻÿ�.
 *  
 *  ��, �迭�� ���� �� �̿��Ͽ� �ۼ��Ͻÿ�.
 * 
 */



import java.util.*;

class Car {

	public void add(int a, int b) {
		int c ;
		c =a +b;
		System.out.println(c);
	}
}




// �л��� ������ �����ϴ� Ŭ����

class Record {
	String name;
	int sco;
}

// ���� ó��
// �Է�, ���, ���

class Grade {
	
	Scanner sc = new Scanner(System.in);
	int n; // �ο���
	Record[] rec;
	
	//�ο����� �Է¹޾� �����ϴ� �Լ�
	void set() {
		
		do {
			System.out.print("�ο��� �Է�(1 ~ 100) :");
			n = sc.nextInt();
		}while(n < 1 || n > 100);
		
		rec = new Record[n];
	}
	
	// �Է� ó��
	void input() {
		
		for(int i= 0; i < rec.length; i++) {
			rec[i] = new Record();// �ο�����ŭ �迭�� ũ�� �Ҵ�
			System.out.printf("�̸� ���� �Է�(%d) : ", (i+1));
			rec[i].name = sc.next();// �̸�
			rec[i].sco = sc.nextInt();// ����
		}
		
		int pass = 0;
		Record temp = new Record();
		boolean flag; 
		// �ڸ� �ٲ��� �Ͼ�� ��� true
		// �ڸ� �ٲ��� �Ͼ�� �ʾ��� ��� false
		do {
		flag = false;
		pass++;
		for(int i =0; i<rec.length-pass; i++) {
			
			if(rec[i].sco < rec[i+1].sco) {
				temp = rec[i];
				rec[i] = rec[i+1];
				rec[i+1] = temp;
				flag = true;
				// �� �ѹ��̶� ������ �Ͼ�� �Ǹ�
				// flag = true�� �ʱ�ȭ
			}
		  }
		}
		while(flag);
		// ȸ���� ���������� �߻��ϴ� ���� ������ �Ͼ�� ���� ���
		// �� �̻� �ݺ����� ������ ���ǹ��� ������ �Ǵ���
	}// input()
	
	
	// ���
	void print() {
		
		System.out.println();
		System.out.println("---------------------------------");
		for(int i =0; i<rec.length; i++) {
			System.out.printf("%3d�� %5s %3d\n", i+1, rec[i].name, rec[i].sco);
		}
		System.out.println("---------------------------------");
	}
}



public class SungJuk {

		
	
	
	public static void main(String[] args) {
		// ��ü ����
		Grade g = new Grade();
		g.set();// �ο��� �Է�
		g.input();
		g.print();
		
		Car c = new Car();
		

	}

}
