package streams;

import java.util.ArrayList;
import java.util.Arrays;

public class ListSqrDivByFour {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(1,2,7,4,8,2,5));
		arrList.stream()
		.filter(i -> i*i%4 == 0)
		.forEach(System.out::println);
	}
}
