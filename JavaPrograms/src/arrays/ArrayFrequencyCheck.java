package arrays;

import java.util.Arrays;

public class ArrayFrequencyCheck {
	public static void main(String[] args) {
		int arr[] = {2,3,6,2,1,9,0,4,7,2,4};
		int len = arr.length;
		checkAndPrintArray(arr, len);
	}

	private static void checkAndPrintArray(int[] arr, int len) {
		Arrays.sort(arr); /* sorted array: [0, 1, 2, 2, 2, 3, 4, 4, 6, 7, 9] */
		for(int i=0; i<len ; i++) {
			int count = 1;
			while(i < len-1 && arr[i] == arr[i+1]) {
				i++;
				count++;
			}
			System.out.println(arr[i] + "Frequency count:" + count);
		}
	}
}
