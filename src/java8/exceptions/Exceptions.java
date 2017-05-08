package java8.exceptions;

import java.io.IOException;

public class Exceptions {
	
	static Integer I;
	
	public static void main(String[] args) throws IOException {
	
		String word = "word";
		
		String s;
		
		try {
			s = I.toString();
		} finally {
			
			try {
				int i = Integer.parseInt(word);
				
			} catch (NumberFormatException e) {
				System.out.println("NumberFormat");
			} finally {
				System.out.println("Fin2");
			}
			System.out.println("Fin 1");
		}
	}
}
