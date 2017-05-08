package java8.lambda.java.util.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class JavaUtilFunctions {
	
	public static void main(String[] args) {
		
		// Predicate (Expression Verification): Given an input attribute, perform check and return true/false.
		Predicate<String> predicate = (str) -> str.isEmpty();
		predicate.test("Is this one empty string?"); // returns false;
		 
		// Function (Type Transformation): Given an input, return an output of a possibly different type
		Function<String, Integer> function = (str) -> Integer.valueOf(str);
		function.apply("1");
		
		// UnaryOperator (Applies operation and returns same type): Extends Function above, but input and output are of the same type
		UnaryOperator<String> unaryOperator = (str) -> str.toUpperCase();
		unaryOperator.apply("lowercase text");
		
		// LongUnaryOperator: Extends UnaryOperator, receiving and returning primitive long values.
		LongUnaryOperator longUnaryOperator = (longValue) -> longValue+1;
		longUnaryOperator.applyAsLong(0);
		
		// Consumer: Accepts an input parameter and returns void. 
		Consumer<String> consumer = (str) -> System.out.println("Just do it");
		consumer.accept("Simply accept this");
		
		// Supplier:  As opposite to Consumer, Supplier does not get an input parameter, but it returns a value.
		Supplier<String> supplier = () -> "Get this as a result";
		supplier.get();
		
		// BiFunction: Takes two parameters and returns a third one.
		BiFunction<String, String, Integer> biFunction = (a, b) -> a.length() + b.length();
		biFunction.apply("First String", "Second String");
		
		// BinaryOperator: Extends BiFunction, but takes all parameters including the result, with the same type.
		BinaryOperator<String> binaryOperator = (a, b) -> a+"-"+b;
		binaryOperator.apply("first", "second");
		
		
	}

}
