package Section_Array;

import java.util.*;

public class Night {
	
	public int Solution(int num, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sumRow, sumColumn;
		int sumDiagonal1 = 0, sumDiagonal2 = 0;
		
		for(int i = 0; i < num; i++) {
			sumRow = sumColumn = 0;
			for(int j = 0; j < num; j++) {
				sumRow += arr[i][j];
				sumColumn += arr[j][i];
				if(sumRow > answer) answer = sumRow;
				else if(sumColumn > answer) answer = sumColumn;
			}
		}
		
		for(int i = 0; i < num; i++) {
			sumDiagonal1 += arr[i][i];
			sumDiagonal2 += arr[i][num-i-1];
			if(sumDiagonal1 > answer) answer = sumDiagonal1;
			else if(sumDiagonal2 > answer) answer = sumDiagonal2;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Night night = new Night();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[][] arr = new int[num][num];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(night.Solution(num, arr));
	}

}
