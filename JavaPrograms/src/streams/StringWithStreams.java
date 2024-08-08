package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringWithStreams {
	public static void main(String[] args) {

//		printDistinctCharsWithCount("abc");
//		printDistinctCharsWithCount("abcab3");
		printDistinctCharsWithCount("hi there, i am pankaj");
		
//		StringBuilder sb = new StringBuilder("Chandu");
//		String result = sb.reverse().toString();
//		System.out.println(result);
		
//		String s1 = "Java ad";
//		s1 = "hello";
//		s1.concat("Python"); 
//		System.out.println(s1);
		
//		String trimmedLine = s1.trim();
//		int count = trimmedLine.isEmpty() ? 0 : trimmedLine.split("\\s").length;
//		System.out.println(count);
		
		String str = "abc";
		String strCopy = str;
		str = "def";
		System.out.println(strCopy); 
	}

	private static void printDistinctCharsWithCount(String input) {
		Map<Character, Integer> charsWithCountMap = new HashMap<>();

		// using Map merge method from Java 8
//		for (char c : input.toCharArray())
//			charsWithCountMap.merge(c, 1, Integer::sum);
//		System.out.println(charsWithCountMap);

		// another way using latest Java enhancements and no for loop, a bit complex though
		List<Character> list = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		list.stream().forEach(c -> charsWithCountMap.merge(c, 1, Integer::sum));
		
		/* Example */
//		"abc".chars() .map(x -> (char)x) .forEach(System.out::println);
//		// Output: 97,98,99
//		"abc".chars().mapToObj(x -> (char)x).forEach(System.out::println);
//		System.out.println(charsWithCountMap);

	}
}
