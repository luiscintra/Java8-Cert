package java8.basic.inner;

public class MemberInnerClassExample {
	
	class Inner {
		
	}
	
	public static void main(String[] args) {

		MemberInnerClassExample outer = new MemberInnerClassExample();
		Inner inner = outer.new Inner();
		
	}

}
