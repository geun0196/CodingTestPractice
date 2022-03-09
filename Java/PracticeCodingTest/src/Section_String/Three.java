//�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���. ������� �� �ܾ�� �������� ���е˴ϴ�.
// ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������ �Ѵ�.

package Section_String;

import java.util.Scanner;

public class Three {
	
	public String solution(String str) {		
		String answer = "";
		
		//indexof(), substring() �̿�
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
		
		//split() �̿�
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
