package Section_String;

import java.util.*;

public class Night {

	public int Solution(String str) {
		int answer = 0;
		
		for(char c: str.toCharArray()) {
			if(c >= 48 && c <= 57) {
				answer = answer*10 + (c-48);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Night night = new Night();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(night.Solution(str));
	}

}
