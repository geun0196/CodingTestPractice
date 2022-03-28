package Section_HashMapAndTreeSet;

import java.util.*;

public class Five {

	public int Solution(int n, int k, int[] arr) {
		int answer = 0;
		//TreeSet은 중복값 제거하고 오름차순으로 정렬한다
		TreeSet<Integer> set = new TreeSet<>();

		//같은 숫자 3장 뽑아도 되는 문제
		// 처음에 햇갈려서 i < n+k-1, j < n+k, z < n 이렇게 두고 풀어서 오답 나옴 
		int sum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int z = j+1; z < n; z++) {
					sum = arr[i] + arr[j] + arr[z];
					set.add(sum);
				}
			}
		}
		
		//내림차순으로 정렬한다 -> ( TreeSet<Integer> set = new TreeSet<>(Collections.ReverseOrder()); ) 또한 가능하다.
		NavigableSet<Integer> desc = set.descendingSet();
		
		int cnt = 0;
		for(int x: desc) {
			cnt++;
			if(cnt == k) {
				answer = x;	
				return answer;
			}
		}
		
		// 경우의 수의 범위를 넘어가면 -1 리턴
		return -1;
	}
	
	public static void main(String[] args) {
		
		Five five = new Five();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print(five.Solution(n, k, arr));
	}

}
