package codingTest.ex01;

public class test18 {

	public static void main(String[] args) {
		
		long answer=0;
		int n=1;
		
		int n_1=1, n_2=0;
		int sum=0;
		for(int i=0; i<n; i++) {
			sum=n_1+n_2;
			n_2=n_1;
			n_1=sum%1234567;
		}
		
		answer=sum%1234567;
		
		System.out.println(answer);
	}

}
