package java8.gc;

import java.util.Date;

public class GC {
	
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		
		System.out.println("Total memory:" + rt.totalMemory());
		System.out.println("Free memory:" + rt.freeMemory());
		
		for (int i=0; i<1000000000; i++) {
			Date d = new Date();
			d=null;
		}
		
		System.out.println("Free memory before GC:" + rt.freeMemory());
		
		System.gc();
		
		System.out.println("Free memory after GC:" + rt.freeMemory());
	}

}
