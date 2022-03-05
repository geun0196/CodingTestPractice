package Section_Array;

import java.util.*;

public class Eight {

	public ArrayList<Integer> Solution(int num, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			int count = 1;
			for(int j = 0; j < num; j++) {
				if(arr[i] < arr[j]) count++;
			}
			answer.add(count);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
	
		Eight eight = new Eight();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x: eight.Solution(num, arr)) {
			System.out.print(x + " ");
		}
	}

}
