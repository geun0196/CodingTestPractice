package Section_Array;

import java.util.*;

public class Four {

	public int[] Solution(int num){
		int[] answer = new int[num];		
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i = 2; i < num ;i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		Four four = new Four();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int x: four.Solution(num)) {
			System.out.print(x + " ");
		}
		
	}

}
