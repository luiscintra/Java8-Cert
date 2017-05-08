package java8.lambda;

public class Lambda1 {
	
	interface Runnable {
		public void run();
		
		static void xoops() {
			System.out.println("xoops");
		}
	}
	
	public static void main(String[] args) {
//		Runnable run1 = () -> System.out.println("");
//		Runnable run2 = () -> { System.out.println(""); }; //Semicolon is required if expression is inside braces
		
		
		Runnable run3 = Runnable::xoops;
		run3.run();
		
		
	}

}
