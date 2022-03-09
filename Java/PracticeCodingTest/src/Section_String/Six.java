package Section_String;

import java.util.Scanner;

public class Six {

	public String Solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i)
				answer += str.charAt(i);
		}
		return answer;
	}
	public static void main(String[] args) {
		
		Six six = new Six();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(six.Solution(str));
		
	}

}
