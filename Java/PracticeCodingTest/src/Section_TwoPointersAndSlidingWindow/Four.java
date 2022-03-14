package Section_TwoPointersAndSlidingWindow;

import java.util.*;

public class Four {

	public int Solution(int n, int m, int[] arr) {
		int answer = 0, sum = 0;
		int lt = 0, rt = 0;
		
		while(rt < n) {
			sum += arr[rt];
			if(sum == m) answer++;
			while(sum >= m) {
				sum -= arr[lt++];
				if(sum == m) answer++;
			}
			rt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Four four = new Four();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(four.Solution(n, m, arr));
		
	}

}
