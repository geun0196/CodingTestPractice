package Section_HashMapAndTreeSet;

import java.util.*;

public class Five {

	public int Solution(int n, int k, int[] arr) {
		int answer = 0;
		//TreeSet�� �ߺ��� �����ϰ� ������������ �����Ѵ�
		TreeSet<Integer> set = new TreeSet<>();

		//���� ���� 3�� �̾Ƶ� �Ǵ� ����
		// ó���� �ް����� i < n+k-1, j < n+k, z < n �̷��� �ΰ� Ǯ� ���� ���� 
		int sum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int z = j+1; z < n; z++) {
					sum = arr[i] + arr[j] + arr[z];
					set.add(sum);
				}
			}
		}
		
		//������������ �����Ѵ� -> ( TreeSet<Integer> set = new TreeSet<>(Collections.ReverseOrder()); ) ���� �����ϴ�.
		NavigableSet<Integer> desc = set.descendingSet();
		
		int cnt = 0;
		for(int x: desc) {
			cnt++;
			if(cnt == k) {
				answer = x;	
				return answer;
			}
		}
		
		// ����� ���� ������ �Ѿ�� -1 ����
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
