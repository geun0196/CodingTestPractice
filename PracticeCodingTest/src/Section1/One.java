// 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.

package Section1;

import java.util.*;
import javax.swing.JOptionPane;

public class One { // 채점할떄는 클래스 이름을 Main으로 변경해야함

	public int NumCheck(String str, char alph) {
        int answer = 0;
        String s = str.toLowerCase();
        for(int i = 0; i <= s.length() - 1; i++) {
        	if (s.charAt(i) == Character.toLowerCase(alph)) {
        		answer++;
        	}
        }
		return answer;
    }
	
	public static void main(String[] args) {
		One one = new One();
		JOptionPane jon = new JOptionPane(); //swing 패널
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();

		//문자열 100이상일경우
		if(str1.length() > 100) { 
            jon.showMessageDialog(jon, "입력가능한 글자를 초과하였습니다.","오류",jon.ERROR_MESSAGE);
            return;
        }
		char ch = sc.next().charAt(0);
		int Num = one.NumCheck(str1, ch);
		System.out.print(Num);
	}
}
