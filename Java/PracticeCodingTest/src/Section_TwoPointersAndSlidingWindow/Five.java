package Section_TwoPointersAndSlidingWindow;

import java.util.*;

public class Five {
	
	public int Solution(int n) {
		int answer = 0, sum = 0;
		int num = (n / 2) + 1;
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = i + 1;
		}
		
		int lt = 0, rt = 0;
		while(rt < num) {
			sum += arr[rt];
			if(sum == n) answer++;
			while(sum >= n) {
				sum -= arr[lt++];
				if(sum == n) answer++;
			}
			rt++;
		}
				
		return answer;
	}

	public static void main(String[] args) {
		
		Five five = new Five();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.print(five.Solution(n));
	}

}
