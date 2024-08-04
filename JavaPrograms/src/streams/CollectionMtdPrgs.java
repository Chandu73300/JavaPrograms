package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionMtdPrgs {
	public static void main(String[] args) {
//		List<String> customCollection = new ArrayList<>();
//        
//        customCollection.add(null);
//        customCollection.add("Banana");
//        customCollection.add("Cherry");
//        for (String item : customCollection) {
//            System.out.println(item);
//        }
        
//        System.out.println(customCollection.size());
//        System.out.println(customCollection.isEmpty());
//		  System.out.println(customCollection.contains(null));true
//        System.out.println(customCollection.containsAll(Arrays.asList("Banana",null)));//true
      //=================================================================//
        
//        Collection<String> collection = Arrays.asList("Apple", "Banana", "Cherry");
//
//        // Example of Object[] toArray()
//        Object[] objectArray = collection.toArray();
//        System.out.println("Object[] toArray():");
//        for (Object item : objectArray) {
//            System.out.println(item);
//        }
//
//        // Example of <T> T[] toArray(T[] a)
//        String[] stringArray = new String[collection.size()];
//        stringArray = collection.toArray(stringArray);
//        System.out.println("\nString[] toArray(T[] a):");
//        for (String item : stringArray) {
//            System.out.println(item);
//        }
//
//        // Example of <T> T[] toArray(IntFunction<T[]> generator) using Stream
//        String[] customArray = collection.stream()
//                .toArray(String[]::new); // Here, String[]::new is an IntFunction
//        System.out.println("\nString[] toArray(IntFunction<T[]> generator):");
//        for (String item : customArray) {
//            System.out.println(item);
//        }
		//=================================================================//
		
//		List<Integer> li = List.of(23,4,24,14,27,5,11,15);//List.of creates a immutable list dot go for it.
//		List<Integer> li = Arrays.asList(23,4,24,14,27,5,11,15);
//		li.removeIf(i -> i >=15);
//		System.out.println(li);
		
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		List<Integer> sqrNumbers = numbers.parallelStream().map(i -> {return (i * i);}).collect(Collectors.toList());
//		System.out.println(sqrNumbers);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		Spliterator<Integer> si = numbers.spliterator();
		while(si.tryAdvance(System.out::println));
	}
}
