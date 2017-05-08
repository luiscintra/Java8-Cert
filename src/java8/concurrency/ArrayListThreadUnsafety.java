package java8.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListThreadUnsafety {

	static int failCount = 0;

	List<Integer> list = new ArrayList<Integer>();
	
	// Synchronized object doesn't help in this scenario because of read/write race condition
	// Read: list.size() Write: list.remove()
	// If the concurrent condition were a write/write scenario, using a Thread-Safe class would help. 
	// List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());

	{
		for (int i = 0; i < 1000; i++) {
			list.add(i);
		}
	}

	void compete() throws InterruptedException {

		Runnable run = () -> {

			// Remove this sync to get a race condition on removing elements from the array 
			// synchronized (this) {

				while (list.size() > 0) {

					Integer i = null;

					try {

						i = list.remove(0);

					} catch (IndexOutOfBoundsException e) {
						e.printStackTrace();
						failCount++;

					}
					// System.out.println(Thread.currentThread().getName() + ":
					// remove: " + i);

					try {
						if (Objects.nonNull(i) && i % 5 == 0)
							Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			//}
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

		for (int i = 0; i < 50; i++) {
			ArrayListThreadUnsafety a = new ArrayListThreadUnsafety();
			a.compete();
		}

		System.out.println("Failed: " + failCount + " spent: " + ((System.currentTimeMillis() - start) / 1000));

	}

}
