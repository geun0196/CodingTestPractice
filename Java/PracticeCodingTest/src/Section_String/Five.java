// 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

package Section_String;

import java.util.*;

public class Five {

	public String Solution(String str) {
		String answer = "";

		int lt = 0, rt = str.length() - 1;
		char[] x = str.toCharArray();
		
		while(lt < rt) {
			if(!Character.isAlphabetic(x[lt])) lt++;
			else if(!Character.isAlphabetic(x[rt])) rt--;
			
			else{
				char c = x[lt];
				x[lt] = x[rt];
				x[rt] = c;
				lt++;
				rt--;
			}
		}
		
		answer = String.valueOf(x);

		return answer;
	}

	public static void main(String[] args) {

		Five five = new Five();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(five.Solution(str));
	}

}
