package codingTest.ex01;

public class test16 {

	public static void main(String[] args) {
		int n, a, b;
		int answer=0;
		
		n=12;
		a=7;
		b=10;
		
		while(n/2 != 0) {
			answer++;
			if(a/2 != b/2) {
				if(Math.abs(a-b)==1) {
					break;
				}
			}
			
			if(a%2!=0) {
				a=a/2+1;
			}else {
				a=a/2;
			}
			if(b%2!=0) {
				b=b/2+1;
			}else {
				b=b/2;
			}
			System.out.println(a);
			System.out.println(b);
			n=n/2;
		}
		
		System.out.println(answer);

	}

}
