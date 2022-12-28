package codingTest.ex01;

import java.util.ArrayList;
import java.util.List;

public class test15 {

	public static void main(String[] args) {
		int[][] triangle= {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		int result=0;
		
		List list=new ArrayList();
		
		System.out.println(triangle.length);
		
		for(int i=0; i<triangle.length; i++) {
			for(int j=0;j<triangle[i].length; j++) {
				for(int k=0; k<triangle[i].length+1; k++) {
					list.add(triangle[i][j]+triangle[j+1][k]);
					System.out.println("1 / "+(triangle[i][j]+triangle[j+1][k]));
				}
			}
			System.out.println(list);
		}

	}

}
