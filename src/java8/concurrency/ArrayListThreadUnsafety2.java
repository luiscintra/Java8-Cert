package java8.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ArrayListThreadUnsafety2 {

	List<Integer> list = new ArrayList<Integer>();
	
	// This is an example in which having a Synchronized List pays off.
	// In this example, given that we have a write/write race condition, we can rely on a Synchronized implementation such as the SynchronizedList wrapper.
	// If we dont use any sort of synchronization, results are unpredictable and often inconsistent. 
	
	// List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
	
	void compete() throws InterruptedException {

		Runnable run = () -> {

			for (int i = 0; i < 1000; i++) {

					// System.out.println(Thread.currentThread().getName() + ":

					try {
						
						list.add(i);
						
						if (i%10==0)
							Thread.sleep(1);
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

		};

		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

	}

	public static void main(String[] args) throws InterruptedException {

		long start = System.currentTimeMillis();

		for (int i = 0; i < 1; i++) {
			ArrayListThreadUnsafety2 a = new ArrayListThreadUnsafety2();
			a.compete();
			System.out.println("Size: "+ a.list.size());
		}
		
		System.out.println("Spent: " + ((System.currentTimeMillis() - start) / 1000));

	}

}
