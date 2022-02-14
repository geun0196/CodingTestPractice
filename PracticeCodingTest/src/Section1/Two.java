// 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

package Section1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Two {
	public String ChangeAlpa(String str) {
		String answer = "";

		// str을 문자배열로 바꿈 (x는 0부터 문자열의 개수만큼 순회하는 인덱스)
		for(char x: str.toCharArray()) {

			// String끼리 덧셈 가능
			if(Character.isLowerCase(x)) 
				answer += Character.toUpperCase(x);
			else
				answer += Character.toLowerCase(x);

			// A~Z ASCII코드로 65 ~ 90 / a~z ASCII로 97 ~ 122 값을 이용해서 가능 (char x는 ASCII코드 값이니까)
			// 	if (x >= 65 && x <= 90)
			// 		answer += Character.toLowerCase(x);
			// 	else
			// 		answer += Character.toUpperCase(x);

		}

		return answer;
	}


	public static void main(String[] args) {

		Two two = new Two();
		JOptionPane jon = new JOptionPane(); //swing 패널

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		//문자열 100이상일경우
		if(str.length() > 100) { 
			jon.showMessageDialog(jon, "입력가능한 글자를 초과하였습니다.","오류",jon.ERROR_MESSAGE);
			return;
		}
		System.out.print(two.ChangeAlpa(str));
	}

}
