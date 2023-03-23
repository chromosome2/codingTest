package codingTest.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test40 {
	static List<Integer> list=new ArrayList<>();

	public static void main(String[] args) {
		int k=80; //현재피로도
		int[][] dungeons= {{80,20},{50,40},{30,10}};
		int answer=-1;
		
		cal(dungeons, k, 0, "");
		Collections.sort(list, Collections.reverseOrder());
		answer=list.get(0);
		
		System.out.println(answer);

	}
	
	public static void cal(int[][] dungeons, int k, int count, String visit) {
		
		for(int i=0; i<dungeons.length; i++) {
			if(visit.indexOf(Integer.toString(i))==-1) {
				if(k>=dungeons[i][0]) {
					cal(dungeons, k-dungeons[i][1], count+1, visit+i);
				}
			}
		}
		list.add(count);
	}

}
