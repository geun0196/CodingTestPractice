package Section_HashMapAndTreeSet;

import java.util.*;

public class Three {

	public ArrayList<Integer> Solution(int n, int k, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		//0�� �ε������� k-2��°������ ������ �����س��´�
		for(int i = 0; i < k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		//SlidingWindow�� �̿�
		int lt = 0;
		//rt�� k-1�ε������� 1ĭ HashMap�� Put�ϰ�(�� ��, k��ŭ�� ���� (map.size()�̿�)�� �ľǿϷ� �Ѵ�) �ٷ� ���� lt�� ���ʴ�� 1ĭ�� �Ѿư���.
		//��, ������ ��ĭ ���� ������ add�ϰ� ���ʿ��� ��ĭ �Ѿư���. �׸��� ���� key�� �ش��ϴ� value���� 0�� �Ǹ� HashMap���� remove ���ش�.
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
