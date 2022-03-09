package Section_Array;

import java.util.*;

public class Two {

	public int Solution(int num, int[] arr) {
		int answer = 1;
		
		int firstHuman = arr[0];
		for(int i = 1; i < num; i++) {
			if(firstHuman < arr[i]) {
				answer++;
				firstHuman = arr[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Two two = new Two();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();	
		}
		
		System.out.print(two.Solution(num, arr));
	}

}
