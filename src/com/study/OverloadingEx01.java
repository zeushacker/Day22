package com.study;

public class OverloadingEx01 {

	public void print() {
		System.out.println("���ڰ� ���� �޼ҵ�........");
	}
	// overloading �� �ƴϸ� ���� �߻�
	/*
	public int print() {
		return 1;
	}
	*/
	
	//�����ε��� ���� �޼ҵ� 
	public void print(int val) {// �Ķ���Ͱ� �ִ�.
		System.out.println("int �� ���ڰ� �ִ� �޼ҵ�........");
	}
	
	
	public void print(long val) {// �Ķ���Ͱ� �ִ�.
		System.out.println("long �� ���ڰ� �ִ� �޼ҵ�........");
	}
	
	public void print(short val) {// �Ķ���Ͱ� �ִ�.
		System.out.println("short �� ���ڰ� �ִ� �޼ҵ�........");
	}
	
    public void write() {
		
	}
	
	public void write(short val) {
		
	}
	
	public void write(int val) {
		
	}

	public void write(long val) {
		
	}

	public void write(double val) {
		
	}
	
    public void write(double val, int a) {
		
	}


	
	
	public static void main(String[] args) {
		OverloadingEx01 oo = new OverloadingEx01();
		
		short s = 10;
		short ss = 10;
		
		int i =10;
		long l = 10;
		
		oo.print();
		oo.print(s);
		oo.print(l);
		oo.print(i);
		
		oo.write();
		oo.write(s);
		oo.write(l);
		oo.write(i);
		

	}

}
