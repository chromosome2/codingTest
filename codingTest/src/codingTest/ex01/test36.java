package codingTest.ex01;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class test36 {

	public static void main(String[] args) {
		int[] prices= {5,1,3,6,7,4,2,2,3};
		int[] answer= new int[prices.length];
		
		Queue<Integer> queue=new LinkedList<>();
		
		for(int i=0; i<prices.length; i++) {
			queue.offer(prices[i]); // 값 추가 실패 시 null, 성공시 값 반환.
		}
		
		for(int index=0; index<prices.length; index++) {
			int standard_price= queue.poll();
			
			for(int q : queue) {
				answer[index]++;
				if(standard_price > q) {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));

	}

}
