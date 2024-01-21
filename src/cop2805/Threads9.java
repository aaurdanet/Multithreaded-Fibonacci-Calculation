package cop2805;

public class Threads9 extends Thread {

	public static int fibonacci(int n) {

		int v1 = 0;
		int v2 = 1;
		int v3 = 0;

		for (int i = 2; i <= n; i++) {
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
		}

		return v3;

	}

	public void run() {

		int time1 = (int) System.currentTimeMillis();
		int n = fibonacci(40);
		int time2 = (int) System.currentTimeMillis();
		int time3= time2 - time1;
		int x = fibonacci(n);
		System.out.println("Dynamic Thread found the answer: "+ n +" in " + time3+" mls");
	
	}
}

