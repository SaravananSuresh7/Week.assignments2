package week1.assignments2;

public class DuplicatesInAnArray {
	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 16, 20 };
		int arrLength = arr.length;
		int count;
		for (int i = 0; i <= arrLength - 1; i++) {
			count = 0;
			for (int j = i; j < arrLength; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(arr[0]);
			}
		}
	}

}
