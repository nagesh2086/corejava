package org.me.core.java;

public class InfiniteLoopThreadTest implements Runnable {

	private String name;
	private double identity;
	private Object _obj;

	@Override
	public void run() {
		while (true) {
			String str = new String("1321");
			String str1 = "13515";
			Object obj = new Object();
			Integer _5kObj = new Integer(5000);
			Integer _5kPrim = 5000;
			// set
			_obj = obj;
			name = str + String.valueOf(Math.random());
			identity = _5kPrim * Math.random();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		Thread t = new Thread(new InfiniteLoopThreadTest(), "InfiniteLoopThreadTest");
		t.start();
	}

}
