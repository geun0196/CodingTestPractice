package Section_Array;

import java.util.*;

public class Twelve {

	public int Solution(int numOfTest, int numOfStudent, int[][] arr) {
		int answer = 0;
		
		for(int i = 1; i <= numOfStudent; i++) { // i, j for���� ��ü ����� �� ( ¦�� ����� ���ؼ� (1���л�,2���л�)�� �л��� �����ϱ� ���� )
			for(int j = 1; j <= numOfStudent; j++) {
				int cnt = 0;
				for(int k = 0; k < numOfTest; k++) { //k, s for���� ��� ����� �� �߿��� ���ǿ� ��ġ�ϴ� ����� �� Ž��
					int pi = 0, pj = 0;
					for(int s = 0; s < numOfStudent; s++) {
						if(arr[k][s] == i) pi = s;
						if(arr[k][s] == j) pj = s;
					}
					if(pi>pj) cnt++;
				}
				if(cnt == numOfTest) answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {

		Twelve twelve = new Twelve();
		Scanner sc = new Scanner(System.in);

		int numOfStudent = sc.nextInt();
		int numOfTest = sc.nextInt();

		int[][] arr = new int[numOfTest][numOfStudent];

		for(int i = 0; i < numOfTest; i++) {			
			for(int j = 0; j < numOfStudent; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(twelve.Solution(numOfTest, numOfStudent, arr));
	}

}
