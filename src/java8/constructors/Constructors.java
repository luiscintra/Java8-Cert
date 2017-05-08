package java8.constructors;

class Xoops {
	
	int x =5;
	
	public Xoops() throws InterruptedException {
		System.out.println("Executing super");
		Thread.sleep(30000);
	}
}

public class Constructors extends Xoops {
	
	public Constructors() throws InterruptedException {
		System.out.println("x="+super.x);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		new Constructors();
	}
	

}
