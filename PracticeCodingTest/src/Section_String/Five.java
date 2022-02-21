// ���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �־����� ���� ���ĺ��� ������, Ư�����ڴ� �ڱ� �ڸ��� �״�� �ִ� ���ڿ��� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.

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
