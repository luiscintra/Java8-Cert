package java8.arrays;

public class Arrays {

	public static void main(String[] args) {
		
//		int[][][][] arr = new int[2][2][2][2];
//		
//		arr[0][0][0][0] = 0;
//		arr[0][0][0][1] = 1;
//		
//		arr[0][0][1][0] = 2;
//		arr[0][0][1][1] = 3;
//		
//		arr[0][1][0][0] = 4;
//		arr[0][1][0][1] = 5;
//		
//		arr[0][1][1][0] = 6;
//		arr[0][1][1][1] = 7;
		
		
//      Above code is the same as:
		
		int[][][][] arr = { { { {0, 1}, {2, 3} }, { {4, 5}, {6, 7} } } };
				
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				for (int k = 0; k < arr[i][j].length; k++) {
					
					for (int l = 0; l < arr[i][j][k].length; l++) {
					
						System.out.println(arr[i][j][k][l]);
						
					}
					
					
					
				}
			}
			
		}
		
	
//		int[][][] arr = new int[2][2][2];
//		
//		arr[0][0][0] = 0;
//		arr[0][0][1] = 1;
//		
//		arr[0][1][0] = 2;
//		arr[0][1][1] = 3;
//		
//		arr[1][0][0] = 4;
//		arr[1][0][1] = 5;
//		
//		arr[1][1][0] = 6;
//		arr[1][1][1] = 7;
		
//      Above code is the same as:
		
//		int[][][] arr = { { {0, 1}, {2, 3} }, { {3, 4}, {5, 6}  } };
//				
//		for (int i = 0; i < arr.length; i++) {
//			
//			for (int j = 0; j < arr[i].length; j++) {
//				
//				for (int k = 0; k < arr[i][j].length; k++) {
//					
//					System.out.println(arr[i][j][k]);
//					
//				}
//			}
//			
//		}
		
	}

}
