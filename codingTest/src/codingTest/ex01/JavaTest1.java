package codingTest.ex01;

public class JavaTest1 {

	public static void main(String[] args) {
		String s="-1 -1";
		String[] split=s.split(" ");
		int max, min;
		min=max=Integer.parseInt(split[0]);
		for(String i : split) {
			int num=Integer.parseInt(i);
			if(max<num) max=num; 
			if(min>num) min=num;
		}

	}

}
