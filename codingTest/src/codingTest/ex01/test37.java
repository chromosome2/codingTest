package codingTest.ex01;

import java.util.LinkedList;
import java.util.Queue;

public class test37 {

	public static void main(String[] args) {
		int bridge_length=3;
		int weight=10;
		int[] truck_weights= {1,5,6,8,2,2,2,2,1};
		int answer=0;
		
		//queue 선언
        Queue<Integer> q=new LinkedList<>();

        int sum=0;
        int index=0;
        
        while(index!=truck_weights.length) {
            if(q.size()==bridge_length) { // 다리길이만큼 트럭이 차면
                sum-=q.remove(); //맨 앞에 있던 트럭 도착지로 빼주기 + sum에서도 제거
            }
            if(sum+truck_weights[index]>weight) {
                q.offer(0); // 다리의 빈 공간에 0을 추가해주기
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
