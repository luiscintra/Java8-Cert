package java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(){{add(1); add(5); add(10);}};
		list.removeIf(p -> p>7);
		System.out.println(list);
	}
	
	interface Xoops1 {
		public default void xoop() {
		}
	}

	interface Xoops2 {
		public default void xoop() {
		}
	}
	
	class ConcreteXoops implements Xoops1, Xoops2 {
		void yay() {
			this.xoop();
		}
		@Override
		public void xoop() {
			Xoops1.super.xoop();
		}
	}

}
