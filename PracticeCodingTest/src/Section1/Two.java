// �빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.

package Section1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Two {
	public String ChangeAlpa(String str) {
		String answer = "";

		// str�� ���ڹ迭�� �ٲ� (x�� 0���� ���ڿ��� ������ŭ ��ȸ�ϴ� �ε���)
		for(char x: str.toCharArray()) {

			// String���� ���� ����
			if(Character.isLowerCase(x)) 
				answer += Character.toUpperCase(x);
			else
				answer += Character.toLowerCase(x);

			// A~Z ASCII�ڵ�� 65 ~ 90 / a~z ASCII�� 97 ~ 122 ���� �̿��ؼ� ���� (char x�� ASCII�ڵ� ���̴ϱ�)
			// 	if (x >= 65 && x <= 90)
			// 		answer += Character.toLowerCase(x);
			// 	else
			// 		answer += Character.toUpperCase(x);

		}

		return answer;
	}


	public static void main(String[] args) {

		Two two = new Two();
		JOptionPane jon = new JOptionPane(); //swing �г�

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		//���ڿ� 100�̻��ϰ��
		if(str.length() > 100) { 
			jon.showMessageDialog(jon, "�Է°����� ���ڸ� �ʰ��Ͽ����ϴ�.","����",jon.ERROR_MESSAGE);
			return;
		}
		System.out.print(two.ChangeAlpa(str));
	}

}
