package Section_String;

import java.util.Scanner;

public class Eleven {

	public String Solution(String s) {
		String answer = "";
		int num = 1;
		
		for(int i = 1; i < s.length(); i++) {
			char c = s.charAt(i-1);
			if(c == s.charAt(i)) {
				num++;
			}
			else {
				if(num == 1) {
					answer += s.charAt(i - 1);
				}
				else {
					answer += (s.charAt(i - 1) + (Integer.toString(num)));
					num = 1;
				}	
			}
		}
		
		if(num == 1) {
			answer += s.charAt(s.length() - 1);
		}
		else {
			answer += (s.charAt(s.length() - 1) + (Integer.toString(num)));
		}
		
		return answer;
	}
	
	public static void main(String[] args) {

		Eleven eleven = new Eleven();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(eleven.Solution(str));
		
	}

}
