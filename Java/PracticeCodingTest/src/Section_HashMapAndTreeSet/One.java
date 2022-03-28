package Section_HashMapAndTreeSet;

import java.util.*;

public class One {

	public char Solution(int n, String str) {
		char answer = ' ';
		//HashMap<Key의 DataType, Value의 DataType> 변수이름 = new HashMap<>(); 객체생성
		HashMap<Character, Integer> map = new HashMap<>();
		
		//HashMap 자주 사용하는 메소드
		//1. map.containsKey(Key값) -> true / false 값 리턴
		//2. map.size() -> key의 개수 리턴
		//3. map.remove(Key값) -> 키에 해당하는 HashMap 삭제 (Value값을 return함)
		
		//HashMap에 (key,value) put하기
		for(char x : str.toCharArray()) {
			//HaspMap에 (key, Value)값을 넣는다. 이 때, get메소드는 key에 해당하는 Value값을 리턴하고 getOrDefault메소드는 Key에 해당하는 Value값이 없으면 괄호 내부 우측 값을 리턴한다.
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		//HashMap Key값에 해당되는 Value값 가져오기
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
