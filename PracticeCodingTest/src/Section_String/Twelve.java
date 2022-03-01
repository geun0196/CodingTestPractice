package Section_String;

import java.util.*;

public class Twelve {

	public String Solution(String s, int n) {
		String answer = "";
		
		for(int i = 0; i < n; i++) {
			String tmp = s.substring(0, 7).replace('#','1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			s = s.substring(7);	
			answer += (char)num;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Twelve twelve = new Twelve();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		System.out.println(twelve.Solution(str, num));
	}

}
