package Section_Array;

import java.util.*;

public class Five {

	public int Solution(int num) {
		int answer = 0;
		int[] arr = new int[num+1]; // 동적할당하면 값은 모두 0이 된다.
		
		for(int i = 2; i <= num; i++) {
			if(arr[i] == 0) {
				//System.out.print(i + " "); //소수를 출력하고 싶을 때
				answer++;
				for(int j = i; j <= num ; j=j+i) {
					arr[j] = 1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {

		Five five = new Five();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(five.Solution(num));
	
	}

}
