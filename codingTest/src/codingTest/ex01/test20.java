package codingTest.ex01;

import java.util.Stack;

public class test20 {


	public static int cal(String s, int strtIdx, int strLen){
        int ret = 0;
        Stack<Character> st = new Stack<>();
        
        System.out.println("strtIdx : "+strtIdx);
        System.out.println("strtIdx + strLen : "+(strtIdx + strLen));
        
        for(int i = strtIdx; i < strtIdx + strLen; i++){
            int idx = i % strLen;
            char c = s.charAt(idx);

            if(c == '(' || c == '{' || c == '[')
                st.push(c);
            else if(c == ')' || c == '}' || c == ']'){
                if(st.empty())
                    return 0;
                else if((st.peek() != '(' && c == ')') || (st.peek() != '{' && c == '}') || (st.peek() != '[' && c == ']'))
                    return 0;
                else
                    st.pop();
            }
        }

        if(!st.empty())
            return 0;

        return 1;
    }
	
	
	public static void main(String[] args) {
		String s="[(){}]()";
		int answer=0;
		
		/*String s1="\\[\\]";
		String s2="\\(\\)";
		String s3="\\{\\}";
		
		
		
		for(int i=0; i<s.length(); i++) {
			s=s.substring(1,s.length())+s.substring(0,1);
			String s_new=s;
			System.out.println(s);
			
			while(true) {
				String s_backup=s_new;
				s_new=s_new.replaceAll(s1, "");
				s_new=s_new.replaceAll(s2, "");
				s_new=s_new.replaceAll(s3, "");
				System.out.println(s_new);
				System.out.println("----");
				if(s_new.equals("")) {
					answer++;
					break;
				}
				if(s_backup==s_new) {
					break;
				}
			}
			System.out.println("++++++++++++++++");
		}*/
		
		int strLen = s.length();
		
        for(int i = 0; i < strLen; i++) {
            answer += cal(s, i, strLen);
            
        }
		
		System.out.println(answer);
		
	}
	

}