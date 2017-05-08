package java8.flow;

import java.util.Random;

public class Flow {
	
	public static void main(String[] args) {

		Random random = new Random();

		int randomMonth = random.nextInt(12)+1;
		
		System.out.println("Month:"+randomMonth);
		
		int numberOfDays = 0;
		
		switch (randomMonth) {
		
			case 9: 
			case 4:
			case 6:
			case 11:
				numberOfDays = 30;
				break;
				
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				numberOfDays = 31;
				break;
				
			case 2:
				numberOfDays = 28;
				break;
				
			default:
				System.out.println("Freak!");
				break;
				
		}
		
		System.out.println("Days:"+numberOfDays);
		
	}
}
