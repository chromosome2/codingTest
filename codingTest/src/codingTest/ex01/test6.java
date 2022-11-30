package codingTest.ex01;

public class test6 {

	public static void main(String[] args) {
		int n=3;
		int c=1;
		int count=0;
		while(c<=n/2) {
			int sum=0;
			for(int i=c; i<=n/2+1; i++) {
				sum+=i;
				if(sum==n) {
					count++;
					break;
				}else if(sum>n) {
					break;
				}
			}
			c++;
		}
		System.out.println(count+1);

	}

}
