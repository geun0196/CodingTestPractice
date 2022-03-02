package Section_Array;

import java.util.Scanner;

public class Three {

	public String Solution(int n, int[][] arr) {
		String answer = "";
		
		for(int i = 0; i < n; i++) {
			
			if(arr[0][i] == arr[1][i]) answer += "D\n";
			else if(arr[0][i] == 2 && arr[1][i] == 1) answer += "A\n";
			else if(arr[0][i] == 1 && arr[1][i] == 3) answer += "A\n";
			else if(arr[0][i] == 3 && arr[1][i] == 2) answer += "A\n";
			else answer += "B\n";
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {

		Three three = new Three();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] arr = new int[2][num];
		
		for(int i = 0; i < num; i++) {
			arr[0][i] = sc.nextInt();	
		}
		for(int i = 0; i < num; i++) {
			arr[1][i] = sc.nextInt();	
		}
		
		System.out.print(three.Solution(num, arr));
	}

}
