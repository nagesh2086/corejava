package wait.notifyall;

public class Application {

	public static void main(String[] args) {
		Data d = new Data();
		
		Thread t1 = new Thread(() ->{
			String[] packets = {"First P","Second P", "Third P", "Fourth P", "Fifth P"};
			for (int i = 0; i < packets.length; i++) {
				d.send(packets[i]);
			}
		});
		
		Thread t2 = new Thread(() ->{
			for(int i = 0; i< 5;i++){
				String receivedPacket = d.receive();
				if (receivedPacket == null) {
					i--;
				}
			}
		});
		
		t1.start();
		t2.start();
	}

}
