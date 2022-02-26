package Section_String;

import java.util.*;

public class Eight {

	public String Solution(String str) {
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		
		String tmp = new StringBuilder(str).reverse().toString();
	
		if(str.equals(tmp)) answer = "YES";
				
		return answer;
	}
	
	public static void main(String[] args) {
		
		Eight eight = new Eight();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(eight.Solution(str));
	}

}
