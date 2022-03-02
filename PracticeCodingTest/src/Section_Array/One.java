package Section_Array;

import java.util.*;

public class One {

	public ArrayList<Integer> Solution(int num, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		
		int Index = arr[0];
		
		for(int i = 1; i < num ; i++) {
			if(Index < arr[i]) {
				answer.add(arr[i]);
				Index = arr[i];
			}
			else {
				Index = arr[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		One one = new One();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();	
		}
		
		for(int x: one.Solution(num, arr)) {
			System.out.print(x + " ");
		}
	}

}
