package Section_TwoPointersAndSlidingWindow;

import java.util.*;

public class Two {
	
//직접 정렬까지 구현하니 time limit 걸림
//	private void swap(int[] a, int i, int j) {
//		int temp = a[i];
//		a[i] = a[j];
//		a[j] = temp;
//	}
//	
//	public void selectionSort(int arr[], int size) {
//		
//		for(int i = 0; i < size -1; i++) {
//			int min_index = i;
//			
//			for(int j = i + 1; j < size; j++) {
//				if(arr[j] < arr[min_index]) {
//					min_index = j;
//				}
//			}
//			
//			swap(arr, i, min_index);
//		}
//	}

	public ArrayList<Integer> Solution(int num1, int num2, int[] arr1, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
//		selectionSort(arr1, arr1.length);
//		selectionSort(arr2, arr2.length);

		int p1 = 0, p2 = 0;		
		while(p1<num1 && p2<num2) {
			if(arr1[p1] == arr2[p2]) {
				answer.add(arr1[p1]);
				p1++;
				p2++;
			}
			else if(arr1[p1] < arr2[p2]) p1++;
			else p2++;
		}

		return answer;
	}

	public static void main(String[] args) {

		Two two = new Two();
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		for(int i = 0; i < num1; i++) {
			arr1[i] = sc.nextInt();
		}

		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];
		for(int i = 0; i < num2; i++) {
			arr2[i] = sc.nextInt();
		}

		for(int x: two.Solution(num1, num2, arr1, arr2)) {
			System.out.print(x + " ");
		}

	}

}
