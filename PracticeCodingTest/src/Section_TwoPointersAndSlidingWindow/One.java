package Section_TwoPointersAndSlidingWindow;

import java.util.*;

public class One {

	public ArrayList<Integer> Solution(int num1, int num2, int[] arr1, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;	
		
		int p1 = 0, p2 = 0;		
		while(p1<num1 && p2<num2) {
			if(arr1[p1] <= arr2[p2]) {
				answer.add(arr1[p1]);
				p1++;
			}
			else{
				answer.add(arr2[p2]);
				p2++;
			}
		}
		
		while(p1<num1) {
			answer.add(arr1[p1]);
			p1++;
		}
		while(p2<num2) {
			answer.add(arr2[p2]);
			p2++;
		}
		
		return answer;
	}

	public static void main(String[] args) {

		One one = new One();
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		for(int i = 0; i < num1; i++) {
			arr1[i] = sc.nextInt();
		}

		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];
		for(int i = 0; i < num2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int x: one.Solution(num1, num2, arr1, arr2)) {
			System.out.print(x + " ");
		}
		
	}

}
