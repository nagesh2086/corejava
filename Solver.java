import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Solver {
	final int N;
	final float[] data;
	final CyclicBarrier barrier;

	class Worker implements Runnable {
		float myRow;
		boolean printed;

		Worker(float row) {
			myRow = row;
			printed = false;
		}

		public void run() {
			// while (!done()) {
			processRow(myRow);

			try {
				barrier.await();
			} catch (InterruptedException ex) {
				return;
			} catch (BrokenBarrierException ex) {
				return;
			}
			// }
		}

		void processRow(float myRow) {
			System.out.println(Thread.currentThread().getName() + " : processed row: " + myRow);
			printed = true;
		}

		boolean done() {
			return printed == false ? false : true;
		}
	}

	public Solver(float[] matrix) throws InterruptedException {
		System.out.println("in Solver constructor");
		data = matrix;
		N = matrix.length;
		
		Runnable barrierAction = new Runnable() {
			public void run() {
				float mergedRows = mergeRows();
				System.out.println(Thread.currentThread().getName() + " : merged rows sum: " + mergedRows);
			}
		};
		barrier = new CyclicBarrier(N, barrierAction);
		System.out.println("barrier created");
		
		executeCyclicBarrier();
		barrier.reset();
		executeCyclicBarrier();
	}

	public void executeCyclicBarrier() throws InterruptedException {
		
		

		List<Thread> threads = new ArrayList<>(N);
		for (int i = 0; i < N; i++) {
			Thread thread = new Thread(new Worker(data[i]));
			threads.add(thread);
			thread.start();
		}
		System.out.println("all thread created and started");

		// wait until done
		for (Thread thread : threads)
			thread.join();
		
	}

	float mergeRows() {
		float sum = 0.0f;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
}
