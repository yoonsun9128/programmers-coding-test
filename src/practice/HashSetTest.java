package practice;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		solution();
	}
	public static void solution() {
		String[] arr = {"apple", "apple", "banana"};
		HashSet<String> set = new HashSet<>();
		for (int i =0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set.contains("hash"));
		// 존재하면 true, 없으면 flase
		// 중복 제거, 데이터 겁색이 가능
	}

	//새로운 자료구죠
	public static void solution2() {
		Integer[] arr = {1, 2, 0, 4, 5};
		HashSet<Integer> set = new HashSet<>();
		int answer = 0;
		for (int a : arr) {
			if (set.contains(a)) {
				set.remove(a);
				answer--;
			} else {
				set.add(a);
				answer++;
			}
		}
		System.out.println(answer);
	}
}
