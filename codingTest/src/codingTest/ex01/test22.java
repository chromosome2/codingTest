package codingTest.ex01;

public class test22 {

	public static void main(String[] args) {
		int[][] arr1= {{2,3,2},{4,2,4},{3,1,4}};
		int[][] arr2= {{5,4,3},{2,4,1},{3,1,1}};
		
		int[][] result= new int[arr1.length][arr2[0].length];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("i = "+i);
			for(int j=0; j<arr2[0].length; j++) {
				System.out.println("j = "+j);
				for(int z=0; z<arr2.length; z++) {
					result[i][j]+=arr1[i][z]*arr2[z][j];
					System.out.println("arr1["+i+"]["+z+"] = "+arr1[i][z]);
					System.out.println("arr2["+z+"]["+j+"] = "+arr2[z][j]);
					System.out.println("result["+i+"]["+j+"] = "+result[i][j]);
					System.out.println("z***********");
				}
				System.out.println("j______________");
			}
			System.out.println("i+++++++++++++");
		}
		
		System.out.println("=====");
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]+", ");
			}
			System.out.println();
		}

	}

}
