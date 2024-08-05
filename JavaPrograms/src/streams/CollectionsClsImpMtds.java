package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class CollectionsClsImpMtds {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("banana", "apple", "cherry");
		Collections.sort(list);
		System.out.println(list); // Output: [apple, banana, cherry]

		List<String> list1 = Arrays.asList("banana", "apple", "cherry");
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list); // Output: [cherry, banana, apple]

		List<String> list3 = Arrays.asList("apple", "banana", "cherry");
		Collections.shuffle(list);
		System.out.println(list); // Output might be: [banana, cherry, apple]

		List<String> list4 = Arrays.asList("apple", "banana", "cherry");
		Random rnd = new Random(1);
		Collections.shuffle(list, rnd);
		System.out.println(list); // Output will be deterministic with the same seed

		List<String> list5 = Arrays.asList("apple", "banana", "cherry");
		Collections.reverse(list);
		System.out.println(list); // Output: [cherry, banana, apple]

		List<String> src = Arrays.asList("apple", "banana", "cherry");
		List<String> dest = new ArrayList<>(Arrays.asList("", "", ""));
		Collections.copy(dest, src);
		System.out.println(dest); // Output: [apple, banana, cherry]

		List<String> list7 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
		Collections.fill(list, "orange");
		System.out.println(list); // Output: [orange, orange, orange]

		List<String> list8 = Collections.nCopies(3, "apple");
		System.out.println(list); // Output: [apple, apple, apple]

		Set<String> set = Collections.singleton("apple");
		System.out.println(set); // Output: [apple]

		List<String> emptyList = Collections.emptyList();
		System.out.println(emptyList); // Output: []

		Set<String> emptySet = Collections.emptySet();
		System.out.println(emptySet); // Output: []

		Map<String, String> emptyMap = Collections.emptyMap();
		System.out.println(emptyMap); // Output: {}

		List<String> list13 = Collections.synchronizedList(new ArrayList<>());

		Set<String> set14 = Collections.synchronizedSet(new HashSet<>());

	}
}
