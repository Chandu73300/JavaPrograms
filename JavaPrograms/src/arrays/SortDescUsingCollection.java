package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortDescUsingCollection {
	public static void main(String[] args) {
		Integer arr[] = {5,3,7,2,9,5,8,2,6};
		Arrays.sort(arr, Collections.reverseOrder());
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
