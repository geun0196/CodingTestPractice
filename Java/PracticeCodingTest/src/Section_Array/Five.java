package Section_Array;

import java.util.*;

public class Five {

	public int Solution(int num) {
		int answer = 0;
		int[] arr = new int[num+1]; // �����Ҵ��ϸ� ���� ��� 0�� �ȴ�.
		
		for(int i = 2; i <= num; i++) {
			if(arr[i] == 0) {
				//System.out.print(i + " "); //�Ҽ��� ����ϰ� ���� ��
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
