package java8.lambda;

import java.util.Arrays;

public class SortArrayWithLambda {
		
	public static void main(String[] args) {
		
		Xoops[] array = {new Xoops(1), new Xoops(3), new Xoops(2), new Xoops(0)};

		/*
		 * Here, the Functional Interface in question is the Comparator from the sort() method signature.
		 * Hence, when we write a lambda expression, we are giving Comparator a implementation to its method compare().
		 * In this anonymous implementation of the method compare(), we call the compare method of the Xoops items.
		 * However, given that the compare method of Xoops is implemented and matches the functional method compare(), 
		 * we can simplify the call using a method reference with the :: syntax. 
		 * 
		 */
		
		// Sweet(1) <3
		Arrays.sort(array, (a, b) -> Xoops.compareXoops(a, b));
		
		// is the same as
		
		// Sweet(2) <3
		Arrays.sort(array, Xoops::compareXoops);
		
		for (Xoops i : array) 
			System.out.println(i.value);
	}
}

class Xoops {
	public Integer value;
	public Xoops(Integer value) {
		this.value = value;
	}
	public static int compareXoops(Xoops a, Xoops b) {
		return a.value.compareTo(b.value);
	}
}
