package codingTest.ex01;

import java.util.LinkedList;
import java.util.Queue;

public class test37 {

	public static void main(String[] args) {
		int bridge_length=2;
		int weight=10;
		int[] truck_weights= {7,4,5,6,4};
		int answer=0;
		
		Queue<Integer> q=new LinkedList<>();
		
		int sum=0;
		for(int i=0; i<truck_weights.length; i++) {
			for(int j=0; j<bridge_length; j++) {
				if(sum+truck_weights[i]<=weight) {
					
				}
			}
		}
		
		System.out.println(answer);

	}

}
