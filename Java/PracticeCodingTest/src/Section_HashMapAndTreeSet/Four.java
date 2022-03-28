package Section_HashMapAndTreeSet;

import java.util.*;

public class Four {

	public int Solution(String s, String t){
		int answer = 0;
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		char[] c = s.toCharArray();
		
		for(int i = 0; i < t.length()-1; i++) {
			map1.put(c[i], map1.getOrDefault(c[i], 0) + 1);
		}
		
		for(char x : t.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0) + 1);
		}
		
		int lt = 0;
		for(int rt = t.length() - 1; rt < s.length(); rt++) {
			map1.put(c[rt], map1.getOrDefault(c[rt], 0) + 1);
			if(map1.equals(map2)) answer++;
			map1.put(c[lt], map1.get(c[lt])-1);			
			if(map1.get(c[lt]) == 0) {
				map1.remove(c[lt]);
			}
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Four four = new Four();
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		System.out.print(four.Solution(s, t));
	}

}
