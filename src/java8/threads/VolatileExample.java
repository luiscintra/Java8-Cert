package java8.threads;

/**
 * In this class, volatile is clearly making a difference.
 * We have main thread and a secondary thread both accessing the boolean flag.
 * The flag is what signals the secondary thread to end its while cycle.
 * 
 * However, we have two memory contexts: one for the main thread and another for the secondary thread.
 * We never know when or if each of these contexts will synchronize with the main memory. Until that happens, there will be discrepancy.
 * 
 * As we can see here, if we don't mark the boolean flag as volatile, it will cause the secondary thread to never end because the value TRUE
 * has already been read to the secondary thread's CPU cache and will keep being considered TRUE.
 * 
 * On the other hand, the main thread has, at some point, set the flag to FALSE, but that operation took place in the main thead's CPU and memory context.
 * As there is nothing preventing that CPUs keep a copy of these values in each CPU cache and registers, we have a visibility problem.
 * 
 * However, by marking the boolean flag as volatile, we tell the VM to always keep that value in the main memory, where it can be seen by 
 * all threads and then making it feasible that one thread communicates with another through this variable.
 *  
 */
public class VolatileExample {
	
	private volatile boolean running = true;
	private int count = 0;
	
	private void start() {

		Thread t = new Thread(() -> {
			while (running) {
				count++;
			}
			
			System.out.println("Thread has finished. Count: "+count);
			
		});
		
		t.start();
		
	}
	
	private void stop() {
		this.running = false;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		VolatileExample v = new VolatileExample();
		
		v.start();
		
		Thread.sleep(1000);
		
		v.stop();
	}

}
