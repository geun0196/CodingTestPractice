package Section_Array;

import java.util.Scanner;

public class Ten {
	
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	
	public int Solution(int num, int[][] arr) {
		int answer = 0;
		
		for(int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				boolean flag = true;
				for(int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if(nx >= 0 && nx < num && ny >= 0 && ny < num && arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Ten ten = new Ten();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.print(ten.Solution(num, arr));
	}

}
