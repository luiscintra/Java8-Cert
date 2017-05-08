package java8.assignments;

class Super {
	
	static {System.out.println("1. Super static block first");}
	
	{System.out.println("3. Super block runs before super constructor");}
	
	public Super() {
		System.out.println("4. Super Constructor should run after block");
	}
	
}

public class InitializationOrder extends Super {

	static {System.out.println("2. Child static block should run right after super static block");}
	
	{System.out.println("5. Child block before constructor");}
	
	public InitializationOrder() {
		System.out.println("6. Child Constructor should run after block");
	}
	
	public static void main(String[] args) {
		new InitializationOrder();
	}

	

}
