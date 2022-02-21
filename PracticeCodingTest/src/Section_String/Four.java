package Section_String;

import java.util.ArrayList;
import java.util.Scanner;

public class Four {

	public ArrayList<String> Solution(String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		//리버스 직접 구현
		for(String x : str) {
			char[] c = x.toCharArray();
			int lt = 0, rt = x.length() - 1;
			while(lt < rt) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
			String currentStr = String.valueOf(c);
			answer.add(currentStr);
		}
		
		//StringBuffer객체 이용
//		for(String x : str) {
//			String tmp = new StringBuffer(x).reverse().toString();
//			answer.add(tmp);
//		}

		return answer;
	}

	public static void main(String[] args) {
		Four four = new Four();

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] str = new String[num];

		for(int i = 0; i < num; i++) {
			str[i] = sc.next();
		}
		for(String x: four.Solution(str)) {
			System.out.println(x);
		}
		
	}
}