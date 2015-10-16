package test;

import java.util.concurrent.locks.ReentrantLock;

public class test2 {
	static ReentrantLock lock = new ReentrantLock();
	public static void main(String [] args){
		m1();
		//m2();
		System.out.println(lock.getHoldCount());
		new Thread(new Runnable(){public void run(){m2();}}).start();
	}
	
	public static void m1(){
		lock.lock();
		m2();
		System.out.println("end...");
	}
	
	public static void m2(){
		lock.lock();
		System.out.println("in m2...");
		lock.unlock();
	}
		
}
