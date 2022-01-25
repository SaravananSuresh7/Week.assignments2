package week1.assignments2;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 3, 7, 5, 8 };
		Arrays.sort(arr);
		for (int i = arr[0]; i < arr.length; i++) {
			if (i != arr[i - 1]) {
				System.out.println("Missing element in the array is " + i);
				break;
			}
		}
	}
}
