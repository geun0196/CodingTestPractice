package Section_HashMapAndTreeSet;

import java.util.*;

public class Three {

	public ArrayList<Integer> Solution(int n, int k, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		//0번 인덱스부터 k-2번째까지의 값들을 세팅해놓는다
		for(int i = 0; i < k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		//SlidingWindow을 이용
		int lt = 0;
		//rt는 k-1인덱스부터 1칸 HashMap에 Put하고(이 때, k만큼의 종류 (map.size()이용)를 파악완료 한다) 바로 다음 lt는 차례대로 1칸씩 쫓아간다.
		//즉, 오른쪽 한칸 가고 정답을 add하고 왼쪽에서 한칸 쫓아간다. 그리고 만약 key에 해당하는 value값이 0이 되면 HashMap에서 remove 해준다.
		for(int rt = k-1; rt < n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);			
			if(map.get(arr[lt]) == 0) {
				map.remove(arr[lt]);
			}
			lt++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Three three = new Three();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : three.Solution(n, k, arr)) {
			System.out.print(x + " ");
		}
	}

}
