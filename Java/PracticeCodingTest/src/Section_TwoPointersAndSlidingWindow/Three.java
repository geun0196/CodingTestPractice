package Section_TwoPointersAndSlidingWindow;

import java.util.*;

public class Three {

	public int Solution(int num1, int num2, int[] arr) {
		int answer = 0, sum = 0;
		
		for(int i = 0; i < num2; i++) sum += arr[i]; //num2 ���� �迭���� num2 ũ�⸸ŭ ���ҵ��� ���Ѵ�
		answer = sum;
		
		for(int i = num2; i < num1; i++) { //num2 ũ�⸦ ���� window�� ���������� ��ĭ�� �и鼭 sum�� Ȯ���Ѵ� (SlidingWindow)
			sum = sum + arr[i] - arr[i - num2];
			if(sum > answer) answer = sum;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Three three = new Three();
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int[] arr = new int[num1];
		
		for(int i = 0; i < num1; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(three.Solution(num1, num2, arr));
	}

}
