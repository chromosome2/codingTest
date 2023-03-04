package codingTest.ex01;

import java.util.LinkedList;
import java.util.Queue;

public class test37 {

	public static void main(String[] args) {
		int bridge_length=100;
		int weight=100;
		int[] truck_weights= {10,10,10,10,10,10,10,10,10,10};
		int answer=0;
		
		Queue<Integer> q=new LinkedList<>();
		
		int sum=0;
		
		int index=0;
		while(index!=truck_weights.length) {
			if(q.size()==bridge_length) {
				sum-=q.remove();
			}
			if(sum+truck_weights[index]>weight) {
				q.offer(0);
				answer++;
			}else {
				sum+=truck_weights[index];
				q.offer(truck_weights[index]);
				answer++;
				index++;
			}
		}
		answer+=bridge_length;
		
		System.out.println(answer);

	}

}
