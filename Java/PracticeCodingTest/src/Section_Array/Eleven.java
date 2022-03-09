package Section_Array;

import java.util.*;

public class Eleven {

	public int Solution(int num, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < num; i++) { // i번째 학생
			int count = 0;
			for(int j = 0; j < num; j++) { // i번째 학생과 비교할 나머지 학생
				for(int k = 0; k < 5; k++) { // i번째 학생과 j번쨰 학생의 같은반 횟수 확인
					if(arr[i][k] == arr[j][k]) {
						count++;
						break;
					}
				}
			}
			count--; //자기 자신 빼기
			if(count > max) {
				max = count;
				answer = i + 1; //1번 학생부터 존재하니까 +1 해준다
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
