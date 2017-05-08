package java8.inheritance;

public class Inheritance {
	
	public static void main(String[] args) {
		Parent parent = new Child();
	}
	
}

class Parent {
	static{System.out.println("static in parent");}
	
	{System.out.println("block in parent");}

	public Parent() {
		System.out.println("constructor in parent");
	}
	
}

class Child extends Parent {
	
	static {System.out.println("static in child");}
	
	{System.out.println("block in child");}
	
	public Child() {
		System.out.println("constructor in child");
	}
	
}

