package java8.assignments;

public class Arrays {
	
	static int[] array1;
	int array2[];
	
	int[][]matrix[][]; // hell, this is legal
	
	static int[][] mtx = new int[3][];
	
	public static void main(String[] args) {
	
		array1 = new int[4];
		
		for (int i : array1) {
			System.out.println(i);
		}
		
	}
	
	

}
