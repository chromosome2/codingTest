package codingTest.ex01;

public class test8 {
	public static void main(String[] args) {
		int n=78;
		
		//�ٸ� ��� Ǯ��
		int postPattern = n & -n;//��Ʈ������. ������ https://coding-factory.tistory.com/521 ����.
		System.out.println(Integer.toBinaryString(n)+" / "+Integer.toBinaryString(-n));
		System.out.println("postPattern : "+postPattern);
		System.out.println("n+postPattern : "+(n+postPattern));
		System.out.println("n^(n+postPattern) : "+(n^(n+postPattern)));
		System.out.println("n^(n+postPattern)/postPattern : "+((n^(n+postPattern))/postPattern));
		System.out.println("n^(n+postPattern)/postPattern>>2 : "+((n^(n+postPattern))/postPattern>>2));
		System.out.println("n+postPattern | smallPattern : "+(n+postPattern | ((n^(n+postPattern))/postPattern>>2)));
		String n_bi=Integer.toBinaryString(n);
		
		//�� Ǯ��
		int len=n_bi.length()-n_bi.replace("1", "").length();
		while(true) {
			n++;
			n_bi=Integer.toBinaryString(n);
			int len_2=n_bi.length()-n_bi.replace("1", "").length();
			if(len==len_2) {
				break;
			}
		}
		System.out.println(n);
	}

}
