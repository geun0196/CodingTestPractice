package Section_String;

import java.util.Scanner;

public class Seven {

	public String Solution(String str) {
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp))
			answer = "YES";
		return answer;
		//방법2 (함수 데이터타입은 void)
//		for(int i = str.length() - 1; i >= 0; i--) {
//			answer += str.charAt(i);
//		}
//		
//		if(answer.toLowerCase().equals(str.toLowerCase()))
//			System.out.println("YES");
//		else
//			System.out.println("NO");
	}
	
	public static void main(String[] args) {
		Seven seven = new Seven();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		System.out.println(seven.Solution(str));	
	}
}
