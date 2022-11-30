package codingTest.ex01;

public class Test2 {

	public static void main(String[] args) {
		String answer="";
		String s="fOr   5the last week";
		/*String[] split_s=s.toLowerCase().split("");
		
		if(!split_s[0].equals(" ")) {
			split_s[0]=split_s[0].toUpperCase();
		}
		for(int i=0; i<split_s.length; i++) {
			if(i!=split_s.length-1) {
				if(split_s[i].equals(" ")) {
					if(!split_s[i+1].equals(" ")) {
						split_s[i+1]=split_s[i+1].toUpperCase();
					}
				}
			}
			answer+=split_s[i];
		}*/
		
		String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }
		
		
		
	}

}
