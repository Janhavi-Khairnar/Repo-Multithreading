package com.technospace.multithreadingdemo;

class Class1 {
	void fun1() {
		System.out.println("Fun1 of Class1.");
	}
}
class Class2 {
	void fun2() {
		System.out.println("Fun2 of Class2.");
	}	
}
	

public class MainClass {

	public static void main(String[] args) {
		Class1 class1 = new Class1();
		class1.fun1();
		
		Class2 class2 = new Class2();
		class2.fun2();
		
		System.out.println("Main Class function.");

	}

}
