package streams;

import java.util.HashMap;
import java.util.Map;

public class StringWithStreams {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String str = null;
		sb.append(str);
		System.out.println("StringBuilder content: " + sb.toString());
		
		Map<Character, Integer> charsWithCountMap = new HashMap<>();
		for (char c : "abc".toCharArray())
			charsWithCountMap.merge(c, 1, Integer::sum);
	}
}
