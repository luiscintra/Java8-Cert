package java8.concurrency;

public class StringBuilderThreadUnsafety {

	StringBuilder str = new StringBuilder("->\n");

	String x = new String();

	void doIt(String a, String b) throws InterruptedException {
		
//		synchronized (a) {

		for (int i = 0; i < 20; i++) {
			str.append(a).append(".").append(b).append(",");
			if (i % 5 == 0)
				Thread.sleep(5);
		}

		str.append("\n");

//		}

	}

	void runShit() throws InterruptedException {

		Thread t1 = new Thread(() -> {

			System.out.println("r1");
			try {
				for (int i = 0; i < 100; i++) 
					doIt("a", "a");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		Thread t2 = new Thread(() -> {
			System.out.println("r2");
			try {
				for (int i = 0; i < 100; i++) 
					doIt("b", "b");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		t1.start();
		t2.start();

		t1.join(0);
		t2.join(0);

		System.out.println(str);

	}

	public static void main(String[] args) throws InterruptedException {

		StringBuilderThreadUnsafety u = new StringBuilderThreadUnsafety();
		for (int i = 0; i < 1; i++) 
			u.runShit();

	}

}
