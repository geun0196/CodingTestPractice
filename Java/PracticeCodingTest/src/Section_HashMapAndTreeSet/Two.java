package Section_HashMapAndTreeSet;

import java.util.*;

public class Two {

	public String Solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		for(char x : s2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) {
				return "NO";
			}
			map.put(x, map.get(x) - 1); 
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Two two = new Two();
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.print(two.Solution(str1, str2));
	}

}
