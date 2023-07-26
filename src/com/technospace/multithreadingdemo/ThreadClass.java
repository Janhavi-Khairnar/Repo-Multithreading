package com.technospace.multithreadingdemo;

class MyClass extends Thread {
	String name;
	MyClass(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=1 ; i<=5 ;i++) {
			System.out.println("Swamini-"+name);
			try {
				sleep(3000);      //3000 milisecond = 3 second
			}	catch(InterruptedException ie) {
				System.out.println("My process is interrupted.");
			}
			
		}
	}
}

public class ThreadClass {

	public static void main(String[] args) {
		
		MyClass myClass = new MyClass("Mankar");
		MyClass myClass2 = new MyClass("Deore");
		
		Thread thread1 = new Thread(myClass);
		Thread thread2 = new Thread(myClass2);
		thread1.start();
		thread2.start();

	}

}
