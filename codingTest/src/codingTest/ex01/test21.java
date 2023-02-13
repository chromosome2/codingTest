package codingTest.ex01;

public class test21 {

	public static void main(String[] args) {
		String s="[(){}]()";
		int answer=0;
		
		for(int i=0; i<s.length(); i++) {
			System.out.println(s);
			if(s.charAt(i)=='(' || s.charAt(i)==')') {
				s=s.replace(s.charAt(i), 'a');
			}else if(s.charAt(i)=='[' || s.charAt(i)==']') {
				s=s.replace(s.charAt(i), 'b');
			}else if(s.charAt(i)=='{' || s.charAt(i)=='}') {
				s=s.replace(s.charAt(i), 'c');
			}
		}
		System.out.println(s);
		
		System.out.println(answer);

	}

}
