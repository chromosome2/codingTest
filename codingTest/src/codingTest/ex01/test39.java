package codingTest.ex01;

public class test39 {

	public static void main(String[] args) {
		int[] numbers= {4,1,2,1};
		int target=4;
		int answer=0;
		
		answer=dfs(numbers, target, 0, 0);
		
		System.out.println(answer);

	}
	
	public static int dfs(int[] numbers, int target, int line, int sum) {
		if(line== numbers.length) {
			if(sum==target) {
				return 1;
			}
			return 0;
		}
		
		return dfs(numbers, target, line+1, sum+numbers[line])+
				dfs(numbers, target, line+1, sum-numbers[line]);
	}

}
