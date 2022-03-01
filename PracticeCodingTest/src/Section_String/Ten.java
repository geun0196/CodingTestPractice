package Section_String;

import java.util.Scanner;

public class Ten {

	public int[] Solution(String s, char t) {
		int[] answer = new int[s.length()];
		int num = 1000;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == t) {
				num = 0;
				answer[i] = num;
			}
			else {
				num++;
				answer[i] = num;
			}
		}
		
		for(int i = s.length() -1; i >= 0; i--) {
			if(s.charAt(i) == t) {
				num = 0;
			}
			else if(s.charAt(i) != t && answer[i] > num){
				num++;
				answer[i] = num;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {

		Ten ten = new Ten();
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char c = sc.next().charAt(0);
				
		for(int i: ten.Solution(s, c)) {
			System.out.print(i + " ");
		}
	}

}
