package cop2805;

import java.util.Scanner;

public class Threads8 extends Thread {

	public static int fibonacci(int n) {
		
		if (n == 0) {
			return 0;

		} else if (n == 1) {
			return 1;
		}

		return fibonacci(n - 1) + fibonacci(n - 2); 
	}

	public void run() {
		
		int time1 = (int) System.currentTimeMillis();
			int n = fibonacci(40);
			int time2 = (int) System.currentTimeMillis();
			int time3= time2 - time1;

			System.out.println("Recursion Thread found the answer: "+ n +" in " + time3+" mls");
		}
	

	public static void main(String[] args) throws InterruptedException {

		
		
		Threads8 method1 = new Threads8();
		method1.start();
		
	
		Threads9 method2 = new Threads9();
		method2.start();
		
		
		
		
		method1.join();
		
		
		
		method2.join();
		
		}
	}

	

