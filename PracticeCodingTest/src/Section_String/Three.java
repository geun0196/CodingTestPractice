//�� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���. ������� �� �ܾ�� �������� ���е˴ϴ�.
// ù �ٿ� ���� �� �ܾ ����Ѵ�. ���� ���̰� �� �ܾ �������� ��� ����ӿ��� ���� ���ʿ� ��ġ�� �ܾ ������ �Ѵ�.

package Section_String;

import java.util.Scanner;

public class Three {
	
	public String solution(String str) {		
		String answer = "";
		int max = Integer.MIN_VALUE;
		String[] s = str.split(" ");
		
		for (String x: s) {
			if(x.length() > max) {
				max = x.length();
				answer = x;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		Three three = new Three();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(three.solution(str));
	}

}
