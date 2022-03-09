package Section_Array;

import java.util.*;

public class Eleven {

	public int Solution(int num, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < num; i++) { // i��° �л�
			int count = 0;
			for(int j = 0; j < num; j++) { // i��° �л��� ���� ������ �л�
				for(int k = 0; k < 5; k++) { // i��° �л��� j���� �л��� ������ Ƚ�� Ȯ��
					if(arr[i][k] == arr[j][k]) {
						count++;
						break;
					}
				}
			}
			count--; //�ڱ� �ڽ� ����
			if(count > max) {
				max = count;
				answer = i + 1; //1�� �л����� �����ϴϱ� +1 ���ش�
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Eleven eleven = new Eleven();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][] arr = new int[num][5];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.print(eleven.Solution(num, arr));
	}

}
