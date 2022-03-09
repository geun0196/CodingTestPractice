package Section_Array;

import java.util.*;

public class Seven {

	public int Solution(int num, int[] arr) {
		int answer = 0, count = 0;
		
		for(int i = 0; i < num; i++) {
			if(arr[i] == 1) {
				count++;
				answer += count;
			}
				
			else {
				count = 0;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {

		Seven seven = new Seven();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(seven.Solution(num, arr));
	}

}
