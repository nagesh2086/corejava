package wait.notifyall;

public class Data {

	private String packet;
	// True then receiver should wait
	// False then sender should wait
	private boolean transfer = true;

	protected synchronized void send(String packet) {
		while (!transfer) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " sent packet: " + packet);
		this.packet = packet;
		transfer = false;
		this.notifyAll();
	}

	protected synchronized String receive() {
		while (transfer) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " received packet: " + packet);
		transfer = true;
		this.notifyAll();
		return packet;
	}
}
