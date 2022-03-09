//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. 문장속의 각 단어는 공백으로 구분됩니다.
// 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 한다.

package Section_String;

import java.util.Scanner;

public class Three {
	
	public String solution(String str) {		
		String answer = "";
		
		//indexof(), substring() 이용
		int m = Integer.MIN_VALUE, pos;
		while((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}			
			str = str.substring(pos + 1);
		}
		
		if(str.length() > m) {
			m = str.length();
			answer = str;
		}			
		
		//split() 이용
//		int max = Integer.MIN_VALUE;
//		String[] s = str.split(" ");
//		
//		for (String x: s) {
//			if(x.length() > max) {
//				max = x.length();
//				answer = x;
//			}
//		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		Three three = new Three();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(three.solution(str));
	}

}
