// �� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.

package Section1;

import java.util.*;
import javax.swing.JOptionPane;

public class One { // ä���ҋ��� Ŭ���� �̸��� Main���� �����ؾ���

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
		JOptionPane jon = new JOptionPane(); //swing �г�
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();

		//���ڿ� 100�̻��ϰ��
		if(str1.length() > 100) { 
            jon.showMessageDialog(jon, "�Է°����� ���ڸ� �ʰ��Ͽ����ϴ�.","����",jon.ERROR_MESSAGE);
            return;
        }
		char ch = sc.next().charAt(0);
		int Num = one.NumCheck(str1, ch);
		System.out.print(Num);
	}
}
