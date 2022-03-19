package Section_TwoPointersAndSlidingWindow;

import java.util.*;

public class Six {
	
	public int Solution(int n, int k, int[] arr) {
		int answer = 0, cnt = 0;
		int lt = 0, rt = 0;
		
		while(rt < n) { //실제 배열의 값은 바꾸지 않고 바꿧다는 가정하에 진행
			if(arr[rt] == 0) cnt++;
			while(cnt > k) {
				if(arr[lt] == 0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
			rt++;
		}
		return answer;
	}

	public static void main(String[] args) {
		
		Six six = new Six();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(six.Solution(n,k,arr));
	}

}
