package com.study;

public class OverloadingEx01 {

	public void print() {
		System.out.println("인자가 없는 메소드........");
	}
	// overloading 이 아니며 오류 발생
	/*
	public int print() {
		return 1;
	}
	*/
	
	//오버로딩이 허용됨 메소드 
	public void print(int val) {// 파라미터가 있다.
		System.out.println("int 형 인자가 있는 메소드........");
	}
	
	
	public void print(long val) {// 파라미터가 있다.
		System.out.println("long 형 인자가 있는 메소드........");
	}
	
	public void print(short val) {// 파라미터가 있다.
		System.out.println("short 형 인자가 있는 메소드........");
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
