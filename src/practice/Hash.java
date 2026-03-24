package practice;

public class Hash {

//	public static void main(String[] args) {
//		int [] result = solution(new char[]{'a', 'a', 'b', 'c'});
//		for (int i = 0; i< result.length; i++) {
//			if (result[i] > 0) {
//				System.out.println(result[i]);
//				System.out.println(i + 'a'); //아스키 숫자 변경 -> result가 알파벳의 인덱스 값으로 매칭
//				System.out.println((char)(i + 'a')); //알파벳으로 변경
//			}
//		}
//	}
//	public static int[] solution(char[] alphas) {
//		int[] count = new int[26];
//		for (int i = 0; i< alphas.length; i++) {
////			아스키(ASCII)
//			int index = alphas[i] - 'a';
////			System.out.println(index);
//			count[index] += 1;
//		}
//		return  count;
//	}

	public static void main(String[] args) {
		int data = test(30, 1000, "abcd");
	}

	public static int test(int x, int m, String myStr) {
		int result = 0;
		char[] changeData = myStr.toCharArray(); //배열로 바꿈
//		System.out.println(myStr.length());
		for (int i = 0; i < myStr.length(); i++) {
			int value = (changeData[i] - 'a') + 1;
			int value2 = (int) Math.pow(x, myStr.length() - (i+1));
			result += value * value2;

		}
		int resultData = result % m;
		System.out.println(resultData);
		return resultData;
	}

	public int solution2(int x, int m, String myStr) {
		long answer = 0;
		long power = 1; // x^0부터 시작 -> 제곱의 값도 차근차근 쌓아가는것

		for (int i = myStr.length() - 1; i >= 0; i--) {
			int value = (myStr.charAt(i) - 'a') + 1;

			answer = (answer + value * power) % m;
			power = (power * x) % m;
		}
		// int형에 대해서는 길이 제한이 있으니 long으로 만든다음 결과 값만 int로 전환!
		return (int) answer;
	}




}
/*
'c' → 99
'a' → 97

index = 99 - 97 = 2
* */
