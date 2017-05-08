package java8.threads;

/**
 * In this class, Volatile is not recommended, because we have a racing condition.
 * Threads are competing to read and write the value of the counter and using volatile only would not guarantee 
 * atomicity on manipulating the counter, therefore, the final result would be inaccurate.
 * 
 * Hence, a synchronized block is the recommended solution and why it's been put in place below.
 * 
 */
public class SynchronizationRecommended {
	
	int counter;
	
	public static void main(String[] args) throws InterruptedException {
		SynchronizationRecommended v = new SynchronizationRecommended();
		
		for (int i=0; i<10; i++)
			v.start();
		
	}
	
	public void start() throws InterruptedException {
		
		this.counter=0;
		
		Runnable r = () -> {
			
			for (int i=0; i<1000; i++)
				
				synchronized (SynchronizationRecommended.class) {
					this.counter++;	
				}
			
		};
		
		Thread t1 = new Thread(r);
		t1.start();

		Thread t2 = new Thread(r);
		t2.start();

		Thread t3 = new Thread(r);
		t3.start();

		Thread t4 = new Thread(r);
		t4.start();

		Thread t5 = new Thread(r);
		t5.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		
		System.out.println("Final count: "+counter);

		
	}

}
