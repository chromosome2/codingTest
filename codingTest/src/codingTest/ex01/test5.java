package codingTest.ex01;

import java.util.ArrayList;
import java.util.List;

public class test5 {

	public static void main(String[] args) {
		List answer= new ArrayList();
		String x="01110";
		int count=0;
		int zero=0;
		while(!x.equals("1")) {
			String[] sp_x=x.split("");
			int one=0;
			for(int i=0; i<sp_x.length; i++) {
				if(sp_x[i].equals("1")) {
					one++;
				}else {
					zero++;
				}
			}
			x=Integer.toBinaryString(one);
			System.out.println(x);
			count++;
		}
		answer.add(count);
		answer.add(zero);
		System.out.println(answer);
		
	}

}
