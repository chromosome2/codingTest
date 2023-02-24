package codingTest.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test35 {

	public static void main(String[] args) {
		int n=20300230;
		int k=2;
		int answer=0;

		String[] n_change=Long.toString(n,k).split("0");
		
		for(String num:n_change) {
            if(num.length()==0 || num.equals("1")) continue;
            if(num.equals("2") || num.equals("3")){
                answer++;
                continue;
            }
            long one=Long.parseLong(num);
            boolean result=true;
            for(int i=2; i<=Math.sqrt(one); i++) {
                if(one % i ==0) {
                    result=false;
                    break;
                }
            }
            if(result==true) {
                answer++;
            }
        }
		
		System.out.println(answer);

	}

}
