package codingTest.ex01;

public class test17 {

	public static void main(String[] args) {
		int n=5;
		int ans=0;

		while(n!=0) {
			ans+=n%2;
			n=n/2;
		}
		
		System.out.println(ans);
		
	}

}
