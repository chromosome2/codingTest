package codingTest.ex01;

import java.util.ArrayList;
import java.util.List;

public class test7 {

	public static void main(String[] args) {
		int n_1=1, n_2=0;
		int n=50,sum=0, answer=0;
		
		
		for(int i=2; i<=n; i++) {
			sum=n_1+n_2;
			n_2=n_1;
			n_1=sum%1234567;
			System.out.println(i +" : "+n_1+" / "+n_2);
			answer=n_1%1234567;
			System.out.println(answer);
		}
		answer=n_1%1234567;

	}

}
