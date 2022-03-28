package Section_HashMapAndTreeSet;

import java.util.*;

public class One {

	public char Solution(int n, String str) {
		char answer = ' ';
		//HashMap<Key�� DataType, Value�� DataType> �����̸� = new HashMap<>(); ��ü����
		HashMap<Character, Integer> map = new HashMap<>();
		
		//HashMap ���� ����ϴ� �޼ҵ�
		//1. map.containsKey(Key��) -> true / false �� ����
		//2. map.size() -> key�� ���� ����
		//3. map.remove(Key��) -> Ű�� �ش��ϴ� HashMap ���� (Value���� return��)
		
		//HashMap�� (key,value) put�ϱ�
		for(char x : str.toCharArray()) {
			//HaspMap�� (key, Value)���� �ִ´�. �� ��, get�޼ҵ�� key�� �ش��ϴ� Value���� �����ϰ� getOrDefault�޼ҵ�� Key�� �ش��ϴ� Value���� ������ ��ȣ ���� ���� ���� �����Ѵ�.
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		//HashMap Key���� �ش�Ǵ� Value�� ��������
		for(char key: map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		One one = new One();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		
		System.out.print(one.Solution(n, str));
	}

}
